package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YingyuanjiaoliuDao;
import com.entity.YingyuanjiaoliuEntity;
import com.service.YingyuanjiaoliuService;
import com.entity.vo.YingyuanjiaoliuVO;
import com.entity.view.YingyuanjiaoliuView;

@Service("yingyuanjiaoliuService")
public class YingyuanjiaoliuServiceImpl extends ServiceImpl<YingyuanjiaoliuDao, YingyuanjiaoliuEntity> implements YingyuanjiaoliuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyuanjiaoliuEntity> page = this.selectPage(
                new Query<YingyuanjiaoliuEntity>(params).getPage(),
                new EntityWrapper<YingyuanjiaoliuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyuanjiaoliuEntity> wrapper) {
		  Page<YingyuanjiaoliuView> page =new Query<YingyuanjiaoliuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingyuanjiaoliuVO> selectListVO(Wrapper<YingyuanjiaoliuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingyuanjiaoliuVO selectVO(Wrapper<YingyuanjiaoliuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingyuanjiaoliuView> selectListView(Wrapper<YingyuanjiaoliuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyuanjiaoliuView selectView(Wrapper<YingyuanjiaoliuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
