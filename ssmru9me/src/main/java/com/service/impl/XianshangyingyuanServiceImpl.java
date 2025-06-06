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


import com.dao.XianshangyingyuanDao;
import com.entity.XianshangyingyuanEntity;
import com.service.XianshangyingyuanService;
import com.entity.vo.XianshangyingyuanVO;
import com.entity.view.XianshangyingyuanView;

@Service("xianshangyingyuanService")
public class XianshangyingyuanServiceImpl extends ServiceImpl<XianshangyingyuanDao, XianshangyingyuanEntity> implements XianshangyingyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianshangyingyuanEntity> page = this.selectPage(
                new Query<XianshangyingyuanEntity>(params).getPage(),
                new EntityWrapper<XianshangyingyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianshangyingyuanEntity> wrapper) {
		  Page<XianshangyingyuanView> page =new Query<XianshangyingyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianshangyingyuanVO> selectListVO(Wrapper<XianshangyingyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianshangyingyuanVO selectVO(Wrapper<XianshangyingyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianshangyingyuanView> selectListView(Wrapper<XianshangyingyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianshangyingyuanView selectView(Wrapper<XianshangyingyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
