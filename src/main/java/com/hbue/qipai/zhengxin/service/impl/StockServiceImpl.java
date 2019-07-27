package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TStock;
import com.hbue.qipai.zhengxin.mapper.StockMapper;
import com.hbue.qipai.zhengxin.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    //创建持久层
    @Autowired
    private StockMapper stockMapper;

    @Override
    public List<TStock> queryAllStock() {
        return stockMapper.queryAllStock();
    }
    @Override
    public void addStock(TStock tStock) {
        stockMapper.addStock(tStock);
    }




}
