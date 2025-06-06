package com.entity.view;

import com.entity.JiziyingyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 集资应援
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@TableName("jiziyingyuan")
public class JiziyingyuanView  extends JiziyingyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiziyingyuanView(){
	}
 
 	public JiziyingyuanView(JiziyingyuanEntity jiziyingyuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiziyingyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
