package com.dao;

import com.entity.DiscussxianshangyingyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxianshangyingyuanVO;
import com.entity.view.DiscussxianshangyingyuanView;


/**
 * 线上应援评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface DiscussxianshangyingyuanDao extends BaseMapper<DiscussxianshangyingyuanEntity> {
	
	List<DiscussxianshangyingyuanVO> selectListVO(@Param("ew") Wrapper<DiscussxianshangyingyuanEntity> wrapper);
	
	DiscussxianshangyingyuanVO selectVO(@Param("ew") Wrapper<DiscussxianshangyingyuanEntity> wrapper);
	
	List<DiscussxianshangyingyuanView> selectListView(@Param("ew") Wrapper<DiscussxianshangyingyuanEntity> wrapper);

	List<DiscussxianshangyingyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxianshangyingyuanEntity> wrapper);
	
	DiscussxianshangyingyuanView selectView(@Param("ew") Wrapper<DiscussxianshangyingyuanEntity> wrapper);
	
}
