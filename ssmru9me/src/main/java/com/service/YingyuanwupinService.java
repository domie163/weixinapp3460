package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingyuanwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingyuanwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingyuanwupinView;


/**
 * 应援物品
 *
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface YingyuanwupinService extends IService<YingyuanwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyuanwupinVO> selectListVO(Wrapper<YingyuanwupinEntity> wrapper);
   	
   	YingyuanwupinVO selectVO(@Param("ew") Wrapper<YingyuanwupinEntity> wrapper);
   	
   	List<YingyuanwupinView> selectListView(Wrapper<YingyuanwupinEntity> wrapper);
   	
   	YingyuanwupinView selectView(@Param("ew") Wrapper<YingyuanwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyuanwupinEntity> wrapper);
   	
}

