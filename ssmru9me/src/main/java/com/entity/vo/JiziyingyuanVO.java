package com.entity.vo;

import com.entity.JiziyingyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 集资应援
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public class JiziyingyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动名称
	 */
	
	private String huodongmingcheng;
		
	/**
	 * 预集金额
	 */
	
	private Integer yujijine;
		
	/**
	 * 明星照片
	 */
	
	private String mingxingzhaopian;
		
	/**
	 * 集资目的
	 */
	
	private String jizimude;
		
	/**
	 * 集资详情
	 */
	
	private String jizixiangqing;
				
	
	/**
	 * 设置：活动名称
	 */
	 
	public void setHuodongmingcheng(String huodongmingcheng) {
		this.huodongmingcheng = huodongmingcheng;
	}
	
	/**
	 * 获取：活动名称
	 */
	public String getHuodongmingcheng() {
		return huodongmingcheng;
	}
				
	
	/**
	 * 设置：预集金额
	 */
	 
	public void setYujijine(Integer yujijine) {
		this.yujijine = yujijine;
	}
	
	/**
	 * 获取：预集金额
	 */
	public Integer getYujijine() {
		return yujijine;
	}
				
	
	/**
	 * 设置：明星照片
	 */
	 
	public void setMingxingzhaopian(String mingxingzhaopian) {
		this.mingxingzhaopian = mingxingzhaopian;
	}
	
	/**
	 * 获取：明星照片
	 */
	public String getMingxingzhaopian() {
		return mingxingzhaopian;
	}
				
	
	/**
	 * 设置：集资目的
	 */
	 
	public void setJizimude(String jizimude) {
		this.jizimude = jizimude;
	}
	
	/**
	 * 获取：集资目的
	 */
	public String getJizimude() {
		return jizimude;
	}
				
	
	/**
	 * 设置：集资详情
	 */
	 
	public void setJizixiangqing(String jizixiangqing) {
		this.jizixiangqing = jizixiangqing;
	}
	
	/**
	 * 获取：集资详情
	 */
	public String getJizixiangqing() {
		return jizixiangqing;
	}
			
}
