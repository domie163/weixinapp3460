package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShijipingtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShijipingtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShijipingtaiView;


/**
 * 市集平台
 *
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface ShijipingtaiService extends IService<ShijipingtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShijipingtaiVO> selectListVO(Wrapper<ShijipingtaiEntity> wrapper);
   	
   	ShijipingtaiVO selectVO(@Param("ew") Wrapper<ShijipingtaiEntity> wrapper);
   	
   	List<ShijipingtaiView> selectListView(Wrapper<ShijipingtaiEntity> wrapper);
   	
   	ShijipingtaiView selectView(@Param("ew") Wrapper<ShijipingtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShijipingtaiEntity> wrapper);
   	
}

