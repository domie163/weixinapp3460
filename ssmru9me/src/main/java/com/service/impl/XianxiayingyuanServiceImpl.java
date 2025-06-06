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


import com.dao.XianxiayingyuanDao;
import com.entity.XianxiayingyuanEntity;
import com.service.XianxiayingyuanService;
import com.entity.vo.XianxiayingyuanVO;
import com.entity.view.XianxiayingyuanView;

@Service("xianxiayingyuanService")
public class XianxiayingyuanServiceImpl extends ServiceImpl<XianxiayingyuanDao, XianxiayingyuanEntity> implements XianxiayingyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianxiayingyuanEntity> page = this.selectPage(
                new Query<XianxiayingyuanEntity>(params).getPage(),
                new EntityWrapper<XianxiayingyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianxiayingyuanEntity> wrapper) {
		  Page<XianxiayingyuanView> page =new Query<XianxiayingyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianxiayingyuanVO> selectListVO(Wrapper<XianxiayingyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianxiayingyuanVO selectVO(Wrapper<XianxiayingyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianxiayingyuanView> selectListView(Wrapper<XianxiayingyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianxiayingyuanView selectView(Wrapper<XianxiayingyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
