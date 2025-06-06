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


import com.dao.ShijipingtaiDao;
import com.entity.ShijipingtaiEntity;
import com.service.ShijipingtaiService;
import com.entity.vo.ShijipingtaiVO;
import com.entity.view.ShijipingtaiView;

@Service("shijipingtaiService")
public class ShijipingtaiServiceImpl extends ServiceImpl<ShijipingtaiDao, ShijipingtaiEntity> implements ShijipingtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShijipingtaiEntity> page = this.selectPage(
                new Query<ShijipingtaiEntity>(params).getPage(),
                new EntityWrapper<ShijipingtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShijipingtaiEntity> wrapper) {
		  Page<ShijipingtaiView> page =new Query<ShijipingtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShijipingtaiVO> selectListVO(Wrapper<ShijipingtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShijipingtaiVO selectVO(Wrapper<ShijipingtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShijipingtaiView> selectListView(Wrapper<ShijipingtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShijipingtaiView selectView(Wrapper<ShijipingtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
