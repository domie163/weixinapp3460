package com.entity.view;

import com.entity.YingyuanjiaoliuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 应援交流
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@TableName("yingyuanjiaoliu")
public class YingyuanjiaoliuView  extends YingyuanjiaoliuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingyuanjiaoliuView(){
	}
 
 	public YingyuanjiaoliuView(YingyuanjiaoliuEntity yingyuanjiaoliuEntity){
 	try {
			BeanUtils.copyProperties(this, yingyuanjiaoliuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
