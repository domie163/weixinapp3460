package com.entity.vo;

import com.entity.YingyuanwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 应援物品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public class YingyuanwupinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品价格
	 */
	
	private Integer wupinjiage;
		
	/**
	 * 物品图片
	 */
	
	private String wupintupian;
		
	/**
	 * 物品详情
	 */
	
	private String wupinxiangqing;
				
	
	/**
	 * 设置：物品价格
	 */
	 
	public void setWupinjiage(Integer wupinjiage) {
		this.wupinjiage = wupinjiage;
	}
	
	/**
	 * 获取：物品价格
	 */
	public Integer getWupinjiage() {
		return wupinjiage;
	}
				
	
	/**
	 * 设置：物品图片
	 */
	 
	public void setWupintupian(String wupintupian) {
		this.wupintupian = wupintupian;
	}
	
	/**
	 * 获取：物品图片
	 */
	public String getWupintupian() {
		return wupintupian;
	}
				
	
	/**
	 * 设置：物品详情
	 */
	 
	public void setWupinxiangqing(String wupinxiangqing) {
		this.wupinxiangqing = wupinxiangqing;
	}
	
	/**
	 * 获取：物品详情
	 */
	public String getWupinxiangqing() {
		return wupinxiangqing;
	}
			
}
