package com.hbue.qipai.zhengxin.mapper;

import com.hbue.qipai.zhengxin.entity.TOutProduct;

import java.util.List;

public interface OutProductMapper {


    //查询所有部门
    List<TOutProduct> queryAllOutProduct();
    //根据id删除
    void deleteOutProduct(Integer id);

    //修改单条产品出入库数据
    void updateOutProduct(TOutProduct tOutProduct);
    //添加一条员工数据
    void addOutProduct(TOutProduct tOutProduct);
}
