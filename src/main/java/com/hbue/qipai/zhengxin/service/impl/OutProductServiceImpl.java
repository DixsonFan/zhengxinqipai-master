package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TOutProduct;
import com.hbue.qipai.zhengxin.mapper.OutProductMapper;
import com.hbue.qipai.zhengxin.service.OutProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutProductServiceImpl implements OutProductService {
    //创建持久层
    @Autowired
    OutProductMapper outProductMapper;

    public OutProductServiceImpl() {
        super();
    }

    @Override
    public List<TOutProduct> queryAllOutProduct() {
        return outProductMapper.queryAllOutProduct();
    }

    @Override
    public void deleteOutProduct(Integer id) {
        outProductMapper.deleteOutProduct(id);
    }

    @Override
    public void updateOutProduct(TOutProduct tOutProduct) {
        outProductMapper.updateOutProduct(tOutProduct);
    }

    @Override
    public void addOutProduct(TOutProduct tOutProduct) {
        outProductMapper.updateOutProduct(tOutProduct);
    }
}
