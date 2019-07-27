package com.hbue.qipai.zhengxin.service;

import com.hbue.qipai.zhengxin.entity.TPart;
import com.hbue.qipai.zhengxin.entity.TStock;

import java.util.List;

public interface StockService {

    //查询所有库存
    List<TStock> queryAllStock();



    //入库
    void addStock(TStock tStock);
}
