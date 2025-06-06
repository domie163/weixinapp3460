package com.entity.view;

import com.entity.JizidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 集资订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@TableName("jizidingdan")
public class JizidingdanView  extends JizidingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JizidingdanView(){
	}
 
 	public JizidingdanView(JizidingdanEntity jizidingdanEntity){
 	try {
			BeanUtils.copyProperties(this, jizidingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
