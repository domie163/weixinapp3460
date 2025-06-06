package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiziyingyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiziyingyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiziyingyuanView;


/**
 * 集资应援
 *
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface JiziyingyuanService extends IService<JiziyingyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiziyingyuanVO> selectListVO(Wrapper<JiziyingyuanEntity> wrapper);
   	
   	JiziyingyuanVO selectVO(@Param("ew") Wrapper<JiziyingyuanEntity> wrapper);
   	
   	List<JiziyingyuanView> selectListView(Wrapper<JiziyingyuanEntity> wrapper);
   	
   	JiziyingyuanView selectView(@Param("ew") Wrapper<JiziyingyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiziyingyuanEntity> wrapper);
   	
}

