package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TProductyear;
import com.hbue.qipai.zhengxin.mapper.TProductyearMapper;
import com.hbue.qipai.zhengxin.service.TProductyearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务层的实现类
 */
@Service
public class TProductyearServiceImpl implements TProductyearService {
    //创建持久层
    @Autowired
    private TProductyearMapper tProductyearMapper;

    @Override
    public List<TProductyear> queryTProductyearAll() {
        return tProductyearMapper.queryTProductyearAll();
    }

    @Override
    public void deleteTProductyear(Integer PId) {
        tProductyearMapper.deleteTProductyear(PId);
    }

    @Override
    public TProductyear getTProductyearById(Integer PId) {
        return tProductyearMapper.getTProductyearById(PId);
    }

    @Override
    public void updateTProductyear(TProductyear tProductyear) {
        tProductyearMapper.updateTProductyear(tProductyear);
    }

    @Override
    public void addTProductyear(TProductyear tProductyear) {
        tProductyearMapper.addTProductyear(tProductyear);
    }
}
