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

import com.entity.YingyuanjiaoliuEntity;
import com.entity.view.YingyuanjiaoliuView;

import com.service.YingyuanjiaoliuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 应援交流
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@RestController
@RequestMapping("/yingyuanjiaoliu")
public class YingyuanjiaoliuController {
    @Autowired
    private YingyuanjiaoliuService yingyuanjiaoliuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YingyuanjiaoliuEntity yingyuanjiaoliu, 
		HttpServletRequest request){

        EntityWrapper<YingyuanjiaoliuEntity> ew = new EntityWrapper<YingyuanjiaoliuEntity>();
		PageUtils page = yingyuanjiaoliuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingyuanjiaoliu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YingyuanjiaoliuEntity yingyuanjiaoliu, 
		HttpServletRequest request){
        EntityWrapper<YingyuanjiaoliuEntity> ew = new EntityWrapper<YingyuanjiaoliuEntity>();
		PageUtils page = yingyuanjiaoliuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingyuanjiaoliu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YingyuanjiaoliuEntity yingyuanjiaoliu){
       	EntityWrapper<YingyuanjiaoliuEntity> ew = new EntityWrapper<YingyuanjiaoliuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yingyuanjiaoliu, "yingyuanjiaoliu")); 
        return R.ok().put("data", yingyuanjiaoliuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YingyuanjiaoliuEntity yingyuanjiaoliu){
        EntityWrapper< YingyuanjiaoliuEntity> ew = new EntityWrapper< YingyuanjiaoliuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yingyuanjiaoliu, "yingyuanjiaoliu")); 
		YingyuanjiaoliuView yingyuanjiaoliuView =  yingyuanjiaoliuService.selectView(ew);
		return R.ok("查询应援交流成功").put("data", yingyuanjiaoliuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YingyuanjiaoliuEntity yingyuanjiaoliu = yingyuanjiaoliuService.selectById(id);
        return R.ok().put("data", yingyuanjiaoliu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YingyuanjiaoliuEntity yingyuanjiaoliu = yingyuanjiaoliuService.selectById(id);
        return R.ok().put("data", yingyuanjiaoliu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YingyuanjiaoliuEntity yingyuanjiaoliu, HttpServletRequest request){
    	yingyuanjiaoliu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingyuanjiaoliu);

        yingyuanjiaoliuService.insert(yingyuanjiaoliu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YingyuanjiaoliuEntity yingyuanjiaoliu, HttpServletRequest request){
    	yingyuanjiaoliu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingyuanjiaoliu);

        yingyuanjiaoliuService.insert(yingyuanjiaoliu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YingyuanjiaoliuEntity yingyuanjiaoliu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yingyuanjiaoliu);
        yingyuanjiaoliuService.updateById(yingyuanjiaoliu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yingyuanjiaoliuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YingyuanjiaoliuEntity> wrapper = new EntityWrapper<YingyuanjiaoliuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yingyuanjiaoliuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
