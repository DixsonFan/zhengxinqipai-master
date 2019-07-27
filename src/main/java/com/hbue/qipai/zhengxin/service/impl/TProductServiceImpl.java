package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TProduct;
import com.hbue.qipai.zhengxin.mapper.TProductMapper;
import com.hbue.qipai.zhengxin.service.TProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务层的实现类
 */
@Service
public class TProductServiceImpl implements TProductService {
    //创建持久层
    @Autowired
    private TProductMapper tProductMapper;

    @Override
    public List<TProduct> queryTProductAll() {
        return tProductMapper.queryTProductAll();
    }

    @Override
    public void deleteTProduct(Integer YId) {
        tProductMapper.deleteTProduct(YId);
    }

    @Override
    public TProduct getTProductById(Integer YId) {
        return tProductMapper.getTProductById(YId);
    }

    @Override
    public void updateTProduct(TProduct tProduct) {
        tProductMapper.updateTProduct(tProduct);
    }

    @Override
    public void addTProduct(TProduct tProduct) {
        tProductMapper.addTProduct(tProduct);
    }
}
