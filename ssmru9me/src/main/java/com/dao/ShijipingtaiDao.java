package com.dao;

import com.entity.ShijipingtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShijipingtaiVO;
import com.entity.view.ShijipingtaiView;


/**
 * 市集平台
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface ShijipingtaiDao extends BaseMapper<ShijipingtaiEntity> {
	
	List<ShijipingtaiVO> selectListVO(@Param("ew") Wrapper<ShijipingtaiEntity> wrapper);
	
	ShijipingtaiVO selectVO(@Param("ew") Wrapper<ShijipingtaiEntity> wrapper);
	
	List<ShijipingtaiView> selectListView(@Param("ew") Wrapper<ShijipingtaiEntity> wrapper);

	List<ShijipingtaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShijipingtaiEntity> wrapper);
	
	ShijipingtaiView selectView(@Param("ew") Wrapper<ShijipingtaiEntity> wrapper);
	
}
