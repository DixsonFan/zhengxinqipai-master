package com.hbue.qipai.zhengxin.mapper;

import com.hbue.qipai.zhengxin.entity.TProductyear;

import java.util.List;

public interface TProductyearMapper {
    //查询所有产品年份信息
    List<TProductyear> queryTProductyearAll();
    //根据id删除产品年份信息
    void deleteTProductyear(Integer PId);
    //根据id查询单个产品年份信息
    TProductyear getTProductyearById(Integer PId);
    //修改单条产品年份信息数据
    void updateTProductyear(TProductyear tProductyear);
    //添加一条产品年份信息数据
    void addTProductyear(TProductyear tProductyear);
}
