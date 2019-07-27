package com.hbue.qipai.zhengxin.service;

import com.hbue.qipai.zhengxin.entity.TInproduct;

import java.util.List;

public interface TInproductService {
    //查询所有产品入库信息
    List<TInproduct> queryTInproductAll();
    //根据id删除产品入库信息
    void deleteTInproduct(Integer DId);
    //根据id查询单个产品入库信息
    TInproduct getTInproductById(Integer DId);
    //修改单条产品入库信息
    void updateTInproduct(TInproduct tInproduct);
    //添加一条产品入库信息
    void addTInproduct(TInproduct tInproduct);
}
