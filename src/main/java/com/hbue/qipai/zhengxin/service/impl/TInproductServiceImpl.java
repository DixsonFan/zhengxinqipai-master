package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TInproduct;
import com.hbue.qipai.zhengxin.mapper.TInproductMapper;
import com.hbue.qipai.zhengxin.service.TInproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务层的实现类
 */
@Service
public class TInproductServiceImpl implements TInproductService {
    //创建持久层
    @Autowired
    private TInproductMapper tInproductMapper;

    @Override
    public List<TInproduct> queryTInproductAll() {
        return tInproductMapper.queryTInproductAll();
    }

    @Override
    public void deleteTInproduct(Integer DId) {
        tInproductMapper.deleteTInproduct(DId);
    }

    @Override
    public TInproduct getTInproductById(Integer DId) {
        return tInproductMapper.getTInproductById(DId);
    }

    @Override
    public void updateTInproduct(TInproduct tInproduct) {
        tInproductMapper.updateTInproduct(tInproduct);
    }

    @Override
    public void addTInproduct(TInproduct tInproduct) {
        tInproductMapper.addTInproduct(tInproduct);
    }
}
