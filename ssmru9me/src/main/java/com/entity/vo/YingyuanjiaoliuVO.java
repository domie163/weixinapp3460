package com.entity.vo;

import com.entity.YingyuanjiaoliuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 应援交流
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public class YingyuanjiaoliuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 帖子内容
	 */
	
	private String tiezineirong;
		
	/**
	 * 帖子封面
	 */
	
	private String tiezifengmian;
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：帖子内容
	 */
	 
	public void setTiezineirong(String tiezineirong) {
		this.tiezineirong = tiezineirong;
	}
	
	/**
	 * 获取：帖子内容
	 */
	public String getTiezineirong() {
		return tiezineirong;
	}
				
	
	/**
	 * 设置：帖子封面
	 */
	 
	public void setTiezifengmian(String tiezifengmian) {
		this.tiezifengmian = tiezifengmian;
	}
	
	/**
	 * 获取：帖子封面
	 */
	public String getTiezifengmian() {
		return tiezifengmian;
	}
			
}
