package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxianshangyingyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxianshangyingyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxianshangyingyuanView;


/**
 * 线上应援评论表
 *
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface DiscussxianshangyingyuanService extends IService<DiscussxianshangyingyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxianshangyingyuanVO> selectListVO(Wrapper<DiscussxianshangyingyuanEntity> wrapper);
   	
   	DiscussxianshangyingyuanVO selectVO(@Param("ew") Wrapper<DiscussxianshangyingyuanEntity> wrapper);
   	
   	List<DiscussxianshangyingyuanView> selectListView(Wrapper<DiscussxianshangyingyuanEntity> wrapper);
   	
   	DiscussxianshangyingyuanView selectView(@Param("ew") Wrapper<DiscussxianshangyingyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxianshangyingyuanEntity> wrapper);
   	
}

