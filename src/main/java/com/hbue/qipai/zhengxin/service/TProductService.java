package com.hbue.qipai.zhengxin.service;

import com.hbue.qipai.zhengxin.entity.TProduct;

import java.util.List;

public interface TProductService {
    //查询所有产品
    List<TProduct> queryTProductAll();
    //根据id删除产品
    void deleteTProduct(Integer PId);
    //根据id查询单个产品
    TProduct getTProductById(Integer PId);
    //修改单条产品数据
    void updateTProduct(TProduct tProduct);
    //添加一条产品数据
    void addTProduct(TProduct tProduct);
}
