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
 * 集资应援
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@TableName("jiziyingyuan")
public class JiziyingyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiziyingyuanEntity() {
		
	}
	
	public JiziyingyuanEntity(T t) {
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
