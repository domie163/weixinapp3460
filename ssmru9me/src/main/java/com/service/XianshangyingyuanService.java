package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianshangyingyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianshangyingyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianshangyingyuanView;


/**
 * 线上应援
 *
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface XianshangyingyuanService extends IService<XianshangyingyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianshangyingyuanVO> selectListVO(Wrapper<XianshangyingyuanEntity> wrapper);
   	
   	XianshangyingyuanVO selectVO(@Param("ew") Wrapper<XianshangyingyuanEntity> wrapper);
   	
   	List<XianshangyingyuanView> selectListView(Wrapper<XianshangyingyuanEntity> wrapper);
   	
   	XianshangyingyuanView selectView(@Param("ew") Wrapper<XianshangyingyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianshangyingyuanEntity> wrapper);
   	
}

