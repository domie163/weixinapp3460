package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 线下应援
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@TableName("xianxiayingyuan")
public class XianxiayingyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XianxiayingyuanEntity() {
		
	}
	
	public XianxiayingyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 活动地点
	 */
					
	private String huodongdidian;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：活动地点
	 */
	public void setHuodongdidian(String huodongdidian) {
		this.huodongdidian = huodongdidian;
	}
	/**
	 * 获取：活动地点
	 */
	public String getHuodongdidian() {
		return huodongdidian;
	}
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
