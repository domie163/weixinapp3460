package com.dao;

import com.entity.YingyuanjiaoliuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyuanjiaoliuVO;
import com.entity.view.YingyuanjiaoliuView;


/**
 * 应援交流
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface YingyuanjiaoliuDao extends BaseMapper<YingyuanjiaoliuEntity> {
	
	List<YingyuanjiaoliuVO> selectListVO(@Param("ew") Wrapper<YingyuanjiaoliuEntity> wrapper);
	
	YingyuanjiaoliuVO selectVO(@Param("ew") Wrapper<YingyuanjiaoliuEntity> wrapper);
	
	List<YingyuanjiaoliuView> selectListView(@Param("ew") Wrapper<YingyuanjiaoliuEntity> wrapper);

	List<YingyuanjiaoliuView> selectListView(Pagination page,@Param("ew") Wrapper<YingyuanjiaoliuEntity> wrapper);
	
	YingyuanjiaoliuView selectView(@Param("ew") Wrapper<YingyuanjiaoliuEntity> wrapper);
	
}
