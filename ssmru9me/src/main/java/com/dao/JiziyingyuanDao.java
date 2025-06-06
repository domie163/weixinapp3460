package com.dao;

import com.entity.JiziyingyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiziyingyuanVO;
import com.entity.view.JiziyingyuanView;


/**
 * 集资应援
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface JiziyingyuanDao extends BaseMapper<JiziyingyuanEntity> {
	
	List<JiziyingyuanVO> selectListVO(@Param("ew") Wrapper<JiziyingyuanEntity> wrapper);
	
	JiziyingyuanVO selectVO(@Param("ew") Wrapper<JiziyingyuanEntity> wrapper);
	
	List<JiziyingyuanView> selectListView(@Param("ew") Wrapper<JiziyingyuanEntity> wrapper);

	List<JiziyingyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiziyingyuanEntity> wrapper);
	
	JiziyingyuanView selectView(@Param("ew") Wrapper<JiziyingyuanEntity> wrapper);
	
}
