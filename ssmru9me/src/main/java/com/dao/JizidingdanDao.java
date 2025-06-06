package com.dao;

import com.entity.JizidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JizidingdanVO;
import com.entity.view.JizidingdanView;


/**
 * 集资订单
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface JizidingdanDao extends BaseMapper<JizidingdanEntity> {
	
	List<JizidingdanVO> selectListVO(@Param("ew") Wrapper<JizidingdanEntity> wrapper);
	
	JizidingdanVO selectVO(@Param("ew") Wrapper<JizidingdanEntity> wrapper);
	
	List<JizidingdanView> selectListView(@Param("ew") Wrapper<JizidingdanEntity> wrapper);

	List<JizidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JizidingdanEntity> wrapper);
	
	JizidingdanView selectView(@Param("ew") Wrapper<JizidingdanEntity> wrapper);
	
}
