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


import com.dao.YingyuanwupinDao;
import com.entity.YingyuanwupinEntity;
import com.service.YingyuanwupinService;
import com.entity.vo.YingyuanwupinVO;
import com.entity.view.YingyuanwupinView;

@Service("yingyuanwupinService")
public class YingyuanwupinServiceImpl extends ServiceImpl<YingyuanwupinDao, YingyuanwupinEntity> implements YingyuanwupinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyuanwupinEntity> page = this.selectPage(
                new Query<YingyuanwupinEntity>(params).getPage(),
                new EntityWrapper<YingyuanwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyuanwupinEntity> wrapper) {
		  Page<YingyuanwupinView> page =new Query<YingyuanwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingyuanwupinVO> selectListVO(Wrapper<YingyuanwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingyuanwupinVO selectVO(Wrapper<YingyuanwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingyuanwupinView> selectListView(Wrapper<YingyuanwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyuanwupinView selectView(Wrapper<YingyuanwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
