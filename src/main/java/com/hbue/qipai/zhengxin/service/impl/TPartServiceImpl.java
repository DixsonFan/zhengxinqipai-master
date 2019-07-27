package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TPart;
import com.hbue.qipai.zhengxin.mapper.TPartMapper;
import com.hbue.qipai.zhengxin.service.TPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务层的实现类
 */
@Service
public class TPartServiceImpl implements TPartService{
    //创建持久层
    @Autowired
    private TPartMapper tPartMapper;

    @Override
    public List<TPart> queryTPartAll() {
        return tPartMapper.queryTPartAll();
    }

    @Override
    public void deleteTPart(Integer PId) {
        tPartMapper.deleteTPart(PId);
    }

    @Override
    public TPart getTPartById(Integer PId) {
        return tPartMapper.getTPartById(PId);
    }

    @Override
    public void updateTPart(TPart tPart) {
        tPartMapper.updateTPart(tPart);
    }

    @Override
    public void addTPart(TPart tPart) {
        tPartMapper.addTPart(tPart);
    }
}
