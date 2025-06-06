package com.entity.model;

import com.entity.XianshangyingyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 线上应援
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public class XianshangyingyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 明星照片
	 */
	
	private String mingxingzhaopian;
		
	/**
	 * 应援标语
	 */
	
	private String yingyuanbiaoyu;
		
	/**
	 * 应援内容
	 */
	
	private String yingyuanneirong;
		
	/**
	 * 应援详情
	 */
	
	private String yingyuanxiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：应援标语
	 */
	 
	public void setYingyuanbiaoyu(String yingyuanbiaoyu) {
		this.yingyuanbiaoyu = yingyuanbiaoyu;
	}
	
	/**
	 * 获取：应援标语
	 */
	public String getYingyuanbiaoyu() {
		return yingyuanbiaoyu;
	}
				
	
	/**
	 * 设置：应援内容
	 */
	 
	public void setYingyuanneirong(String yingyuanneirong) {
		this.yingyuanneirong = yingyuanneirong;
	}
	
	/**
	 * 获取：应援内容
	 */
	public String getYingyuanneirong() {
		return yingyuanneirong;
	}
				
	
	/**
	 * 设置：应援详情
	 */
	 
	public void setYingyuanxiangqing(String yingyuanxiangqing) {
		this.yingyuanxiangqing = yingyuanxiangqing;
	}
	
	/**
	 * 获取：应援详情
	 */
	public String getYingyuanxiangqing() {
		return yingyuanxiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
