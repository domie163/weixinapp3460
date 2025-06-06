package com.entity.view;

import com.entity.DiscussxianshangyingyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 线上应援评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@TableName("discussxianshangyingyuan")
public class DiscussxianshangyingyuanView  extends DiscussxianshangyingyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxianshangyingyuanView(){
	}
 
 	public DiscussxianshangyingyuanView(DiscussxianshangyingyuanEntity discussxianshangyingyuanEntity){
 	try {
			BeanUtils.copyProperties(this, discussxianshangyingyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
