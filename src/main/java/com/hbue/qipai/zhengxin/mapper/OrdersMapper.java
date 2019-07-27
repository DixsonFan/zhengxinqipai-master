package com.hbue.qipai.zhengxin.mapper;

import com.hbue.qipai.zhengxin.entity.TOrders;

import java.util.List;

public interface OrdersMapper {

        //查询所有订单
    List<TOrders> queryAllOrders();
    //根据id删除
    void deleteOrders(Integer id);

    //修改单条订单数据
    void updateOrders(TOrders tOrders);
    //添加一条订单数据
    void addOrders(TOrders tOrders);
}
