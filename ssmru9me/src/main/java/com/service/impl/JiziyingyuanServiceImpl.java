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


import com.dao.JiziyingyuanDao;
import com.entity.JiziyingyuanEntity;
import com.service.JiziyingyuanService;
import com.entity.vo.JiziyingyuanVO;
import com.entity.view.JiziyingyuanView;

@Service("jiziyingyuanService")
public class JiziyingyuanServiceImpl extends ServiceImpl<JiziyingyuanDao, JiziyingyuanEntity> implements JiziyingyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiziyingyuanEntity> page = this.selectPage(
                new Query<JiziyingyuanEntity>(params).getPage(),
                new EntityWrapper<JiziyingyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiziyingyuanEntity> wrapper) {
		  Page<JiziyingyuanView> page =new Query<JiziyingyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiziyingyuanVO> selectListVO(Wrapper<JiziyingyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiziyingyuanVO selectVO(Wrapper<JiziyingyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiziyingyuanView> selectListView(Wrapper<JiziyingyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiziyingyuanView selectView(Wrapper<JiziyingyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
