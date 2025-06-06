package com.dao;

import com.entity.YingyuanwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyuanwupinVO;
import com.entity.view.YingyuanwupinView;


/**
 * 应援物品
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface YingyuanwupinDao extends BaseMapper<YingyuanwupinEntity> {
	
	List<YingyuanwupinVO> selectListVO(@Param("ew") Wrapper<YingyuanwupinEntity> wrapper);
	
	YingyuanwupinVO selectVO(@Param("ew") Wrapper<YingyuanwupinEntity> wrapper);
	
	List<YingyuanwupinView> selectListView(@Param("ew") Wrapper<YingyuanwupinEntity> wrapper);

	List<YingyuanwupinView> selectListView(Pagination page,@Param("ew") Wrapper<YingyuanwupinEntity> wrapper);
	
	YingyuanwupinView selectView(@Param("ew") Wrapper<YingyuanwupinEntity> wrapper);
	
}
