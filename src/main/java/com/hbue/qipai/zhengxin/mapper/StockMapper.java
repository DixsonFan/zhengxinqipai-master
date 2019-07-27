package com.hbue.qipai.zhengxin.mapper;

import com.hbue.qipai.zhengxin.entity.TPart;
import com.hbue.qipai.zhengxin.entity.TStock;

import java.util.List;

public interface StockMapper {
    //查询所有部门
    List<TStock> queryAllStock();


    void addStock(TStock tStock);
}
