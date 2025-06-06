package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianxiayingyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianxiayingyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianxiayingyuanView;


/**
 * 线下应援
 *
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface XianxiayingyuanService extends IService<XianxiayingyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianxiayingyuanVO> selectListVO(Wrapper<XianxiayingyuanEntity> wrapper);
   	
   	XianxiayingyuanVO selectVO(@Param("ew") Wrapper<XianxiayingyuanEntity> wrapper);
   	
   	List<XianxiayingyuanView> selectListView(Wrapper<XianxiayingyuanEntity> wrapper);
   	
   	XianxiayingyuanView selectView(@Param("ew") Wrapper<XianxiayingyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianxiayingyuanEntity> wrapper);
   	
}

