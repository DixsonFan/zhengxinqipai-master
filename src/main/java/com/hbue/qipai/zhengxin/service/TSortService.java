package com.hbue.qipai.zhengxin.service;

import com.hbue.qipai.zhengxin.entity.TSort;

import java.util.List;

public interface TSortService {
    List<TSort> queryTSortAll();
    //根据id删除产品分类信息
    void deleteTSort(Integer PId);
    //根据id查询单个产品分类信息
    TSort getTSortById(Integer PId);
    //修改单条产品分类信息数据
    void updateTSort(TSort tSort);
    //添加一条产品分类信息数据
    void addTSort(TSort tSort);
}
