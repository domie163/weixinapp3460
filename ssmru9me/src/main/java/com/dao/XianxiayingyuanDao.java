package com.dao;

import com.entity.XianxiayingyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianxiayingyuanVO;
import com.entity.view.XianxiayingyuanView;


/**
 * 线下应援
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface XianxiayingyuanDao extends BaseMapper<XianxiayingyuanEntity> {
	
	List<XianxiayingyuanVO> selectListVO(@Param("ew") Wrapper<XianxiayingyuanEntity> wrapper);
	
	XianxiayingyuanVO selectVO(@Param("ew") Wrapper<XianxiayingyuanEntity> wrapper);
	
	List<XianxiayingyuanView> selectListView(@Param("ew") Wrapper<XianxiayingyuanEntity> wrapper);

	List<XianxiayingyuanView> selectListView(Pagination page,@Param("ew") Wrapper<XianxiayingyuanEntity> wrapper);
	
	XianxiayingyuanView selectView(@Param("ew") Wrapper<XianxiayingyuanEntity> wrapper);
	
}
