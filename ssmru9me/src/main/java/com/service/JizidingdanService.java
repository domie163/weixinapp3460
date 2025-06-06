package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JizidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JizidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JizidingdanView;


/**
 * 集资订单
 *
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface JizidingdanService extends IService<JizidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JizidingdanVO> selectListVO(Wrapper<JizidingdanEntity> wrapper);
   	
   	JizidingdanVO selectVO(@Param("ew") Wrapper<JizidingdanEntity> wrapper);
   	
   	List<JizidingdanView> selectListView(Wrapper<JizidingdanEntity> wrapper);
   	
   	JizidingdanView selectView(@Param("ew") Wrapper<JizidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JizidingdanEntity> wrapper);
   	
}

