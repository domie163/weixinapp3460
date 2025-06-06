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
 * 线上应援
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@TableName("xianshangyingyuan")
public class XianshangyingyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XianshangyingyuanEntity() {
		
	}
	
	public XianshangyingyuanEntity(T t) {
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
	 * 应援明星
	 */
					
	private String yingyuanmingxing;
	
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
