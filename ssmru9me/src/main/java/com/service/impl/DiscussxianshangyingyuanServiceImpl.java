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


import com.dao.DiscussxianshangyingyuanDao;
import com.entity.DiscussxianshangyingyuanEntity;
import com.service.DiscussxianshangyingyuanService;
import com.entity.vo.DiscussxianshangyingyuanVO;
import com.entity.view.DiscussxianshangyingyuanView;

@Service("discussxianshangyingyuanService")
public class DiscussxianshangyingyuanServiceImpl extends ServiceImpl<DiscussxianshangyingyuanDao, DiscussxianshangyingyuanEntity> implements DiscussxianshangyingyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxianshangyingyuanEntity> page = this.selectPage(
                new Query<DiscussxianshangyingyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussxianshangyingyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxianshangyingyuanEntity> wrapper) {
		  Page<DiscussxianshangyingyuanView> page =new Query<DiscussxianshangyingyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxianshangyingyuanVO> selectListVO(Wrapper<DiscussxianshangyingyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxianshangyingyuanVO selectVO(Wrapper<DiscussxianshangyingyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxianshangyingyuanView> selectListView(Wrapper<DiscussxianshangyingyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxianshangyingyuanView selectView(Wrapper<DiscussxianshangyingyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
