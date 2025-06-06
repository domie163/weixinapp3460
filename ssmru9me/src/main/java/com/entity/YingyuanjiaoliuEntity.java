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
 * 应援交流
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
@TableName("yingyuanjiaoliu")
public class YingyuanjiaoliuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingyuanjiaoliuEntity() {
		
	}
	
	public YingyuanjiaoliuEntity(T t) {
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
	 * 帖子标题
	 */
					
	private String tiezibiaoti;
	
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
	 * 设置：帖子标题
	 */
	public void setTiezibiaoti(String tiezibiaoti) {
		this.tiezibiaoti = tiezibiaoti;
	}
	/**
	 * 获取：帖子标题
	 */
	public String getTiezibiaoti() {
		return tiezibiaoti;
	}
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
