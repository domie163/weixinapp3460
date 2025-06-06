package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XianxiayingyuanEntity;
import com.entity.view.XianxiayingyuanView;

import com.service.XianxiayingyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 线下应援
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@RestController
@RequestMapping("/xianxiayingyuan")
public class XianxiayingyuanController {
    @Autowired
    private XianxiayingyuanService xianxiayingyuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XianxiayingyuanEntity xianxiayingyuan, 
		HttpServletRequest request){

        EntityWrapper<XianxiayingyuanEntity> ew = new EntityWrapper<XianxiayingyuanEntity>();
		PageUtils page = xianxiayingyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianxiayingyuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XianxiayingyuanEntity xianxiayingyuan, 
		HttpServletRequest request){
        EntityWrapper<XianxiayingyuanEntity> ew = new EntityWrapper<XianxiayingyuanEntity>();
		PageUtils page = xianxiayingyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianxiayingyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XianxiayingyuanEntity xianxiayingyuan){
       	EntityWrapper<XianxiayingyuanEntity> ew = new EntityWrapper<XianxiayingyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xianxiayingyuan, "xianxiayingyuan")); 
        return R.ok().put("data", xianxiayingyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XianxiayingyuanEntity xianxiayingyuan){
        EntityWrapper< XianxiayingyuanEntity> ew = new EntityWrapper< XianxiayingyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xianxiayingyuan, "xianxiayingyuan")); 
		XianxiayingyuanView xianxiayingyuanView =  xianxiayingyuanService.selectView(ew);
		return R.ok("查询线下应援成功").put("data", xianxiayingyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XianxiayingyuanEntity xianxiayingyuan = xianxiayingyuanService.selectById(id);
        return R.ok().put("data", xianxiayingyuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XianxiayingyuanEntity xianxiayingyuan = xianxiayingyuanService.selectById(id);
        return R.ok().put("data", xianxiayingyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XianxiayingyuanEntity xianxiayingyuan, HttpServletRequest request){
    	xianxiayingyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xianxiayingyuan);

        xianxiayingyuanService.insert(xianxiayingyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XianxiayingyuanEntity xianxiayingyuan, HttpServletRequest request){
    	xianxiayingyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xianxiayingyuan);

        xianxiayingyuanService.insert(xianxiayingyuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XianxiayingyuanEntity xianxiayingyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xianxiayingyuan);
        xianxiayingyuanService.updateById(xianxiayingyuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xianxiayingyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XianxiayingyuanEntity> wrapper = new EntityWrapper<XianxiayingyuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = xianxiayingyuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
