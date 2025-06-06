package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingyuanjiaoliuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingyuanjiaoliuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingyuanjiaoliuView;


/**
 * 应援交流
 *
 * @author 
 * @email 
 * @date 2021-04-24 14:55:11
 */
public interface YingyuanjiaoliuService extends IService<YingyuanjiaoliuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyuanjiaoliuVO> selectListVO(Wrapper<YingyuanjiaoliuEntity> wrapper);
   	
   	YingyuanjiaoliuVO selectVO(@Param("ew") Wrapper<YingyuanjiaoliuEntity> wrapper);
   	
   	List<YingyuanjiaoliuView> selectListView(Wrapper<YingyuanjiaoliuEntity> wrapper);
   	
   	YingyuanjiaoliuView selectView(@Param("ew") Wrapper<YingyuanjiaoliuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyuanjiaoliuEntity> wrapper);
   	
}

