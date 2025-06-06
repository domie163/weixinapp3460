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


import com.dao.JizidingdanDao;
import com.entity.JizidingdanEntity;
import com.service.JizidingdanService;
import com.entity.vo.JizidingdanVO;
import com.entity.view.JizidingdanView;

@Service("jizidingdanService")
public class JizidingdanServiceImpl extends ServiceImpl<JizidingdanDao, JizidingdanEntity> implements JizidingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JizidingdanEntity> page = this.selectPage(
                new Query<JizidingdanEntity>(params).getPage(),
                new EntityWrapper<JizidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JizidingdanEntity> wrapper) {
		  Page<JizidingdanView> page =new Query<JizidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JizidingdanVO> selectListVO(Wrapper<JizidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JizidingdanVO selectVO(Wrapper<JizidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JizidingdanView> selectListView(Wrapper<JizidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JizidingdanView selectView(Wrapper<JizidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
