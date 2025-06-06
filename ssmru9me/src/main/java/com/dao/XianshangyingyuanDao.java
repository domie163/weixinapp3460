package com.dao;

import com.entity.XianshangyingyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianshangyingyuanVO;
import com.entity.view.XianshangyingyuanView;


/**
 * 线上应援
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface XianshangyingyuanDao extends BaseMapper<XianshangyingyuanEntity> {
	
	List<XianshangyingyuanVO> selectListVO(@Param("ew") Wrapper<XianshangyingyuanEntity> wrapper);
	
	XianshangyingyuanVO selectVO(@Param("ew") Wrapper<XianshangyingyuanEntity> wrapper);
	
	List<XianshangyingyuanView> selectListView(@Param("ew") Wrapper<XianshangyingyuanEntity> wrapper);

	List<XianshangyingyuanView> selectListView(Pagination page,@Param("ew") Wrapper<XianshangyingyuanEntity> wrapper);
	
	XianshangyingyuanView selectView(@Param("ew") Wrapper<XianshangyingyuanEntity> wrapper);
	
}
