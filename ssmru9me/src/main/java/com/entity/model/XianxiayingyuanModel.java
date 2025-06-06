package com.entity.model;

import com.entity.XianxiayingyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 线下应援
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public class XianxiayingyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 活动名称
	 */
	
	private String huodongmingcheng;
		
	/**
	 * 活动内容
	 */
	
	private String huodongneirong;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 参与人数
	 */
	
	private String canyurenshu;
		
	/**
	 * 应援明星
	 */
	
	private String yingyuanmingxing;
		
	/**
	 * 明星照片
	 */
	
	private String mingxingzhaopian;
		
	/**
	 * 活动详情
	 */
	
	private String huodongxiangqing;
				
	
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
	 * 设置：活动内容
	 */
	 
	public void setHuodongneirong(String huodongneirong) {
		this.huodongneirong = huodongneirong;
	}
	
	/**
	 * 获取：活动内容
	 */
	public String getHuodongneirong() {
		return huodongneirong;
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
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：参与人数
	 */
	 
	public void setCanyurenshu(String canyurenshu) {
		this.canyurenshu = canyurenshu;
	}
	
	/**
	 * 获取：参与人数
	 */
	public String getCanyurenshu() {
		return canyurenshu;
	}
				
	
	/**
	 * 设置：应援明星
	 */
	 
	public void setYingyuanmingxing(String yingyuanmingxing) {
		this.yingyuanmingxing = yingyuanmingxing;
	}
	
	/**
	 * 获取：应援明星
	 */
	public String getYingyuanmingxing() {
		return yingyuanmingxing;
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
	 * 设置：活动详情
	 */
	 
	public void setHuodongxiangqing(String huodongxiangqing) {
		this.huodongxiangqing = huodongxiangqing;
	}
	
	/**
	 * 获取：活动详情
	 */
	public String getHuodongxiangqing() {
		return huodongxiangqing;
	}
			
}
