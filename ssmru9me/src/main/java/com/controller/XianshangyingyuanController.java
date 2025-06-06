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

import com.entity.XianshangyingyuanEntity;
import com.entity.view.XianshangyingyuanView;

import com.service.XianshangyingyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 线上应援
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@RestController
@RequestMapping("/xianshangyingyuan")
public class XianshangyingyuanController {
    @Autowired
    private XianshangyingyuanService xianshangyingyuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XianshangyingyuanEntity xianshangyingyuan, 
		HttpServletRequest request){

        EntityWrapper<XianshangyingyuanEntity> ew = new EntityWrapper<XianshangyingyuanEntity>();
		PageUtils page = xianshangyingyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianshangyingyuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XianshangyingyuanEntity xianshangyingyuan, 
		HttpServletRequest request){
        EntityWrapper<XianshangyingyuanEntity> ew = new EntityWrapper<XianshangyingyuanEntity>();
		PageUtils page = xianshangyingyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xianshangyingyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XianshangyingyuanEntity xianshangyingyuan){
       	EntityWrapper<XianshangyingyuanEntity> ew = new EntityWrapper<XianshangyingyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xianshangyingyuan, "xianshangyingyuan")); 
        return R.ok().put("data", xianshangyingyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XianshangyingyuanEntity xianshangyingyuan){
        EntityWrapper< XianshangyingyuanEntity> ew = new EntityWrapper< XianshangyingyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xianshangyingyuan, "xianshangyingyuan")); 
		XianshangyingyuanView xianshangyingyuanView =  xianshangyingyuanService.selectView(ew);
		return R.ok("查询线上应援成功").put("data", xianshangyingyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XianshangyingyuanEntity xianshangyingyuan = xianshangyingyuanService.selectById(id);
        return R.ok().put("data", xianshangyingyuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XianshangyingyuanEntity xianshangyingyuan = xianshangyingyuanService.selectById(id);
        return R.ok().put("data", xianshangyingyuan);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        XianshangyingyuanEntity xianshangyingyuan = xianshangyingyuanService.selectById(id);
        if(type.equals("1")) {
        	xianshangyingyuan.setThumbsupnum(xianshangyingyuan.getThumbsupnum()+1);
        } else {
        	xianshangyingyuan.setCrazilynum(xianshangyingyuan.getCrazilynum()+1);
        }
        xianshangyingyuanService.updateById(xianshangyingyuan);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XianshangyingyuanEntity xianshangyingyuan, HttpServletRequest request){
    	xianshangyingyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xianshangyingyuan);

        xianshangyingyuanService.insert(xianshangyingyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XianshangyingyuanEntity xianshangyingyuan, HttpServletRequest request){
    	xianshangyingyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xianshangyingyuan);

        xianshangyingyuanService.insert(xianshangyingyuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XianshangyingyuanEntity xianshangyingyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xianshangyingyuan);
        xianshangyingyuanService.updateById(xianshangyingyuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xianshangyingyuanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XianshangyingyuanEntity> wrapper = new EntityWrapper<XianshangyingyuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = xianshangyingyuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
