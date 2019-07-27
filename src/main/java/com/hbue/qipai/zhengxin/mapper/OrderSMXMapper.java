package com.hbue.qipai.zhengxin.mapper;

import com.hbue.qipai.zhengxin.entity.TOrderSMX;

import java.util.List;

public interface OrderSMXMapper {

    //查询所有订单明细
    List<TOrderSMX> queryAllOrderSMX();
    //根据id删除
    void deleteOrderSMX(Integer id);

    //修改单条订单数据明细
    void updateOrderSMX(TOrderSMX tOrderSMX);
    //添加一条订单数据明细
    void addOrderSMX(TOrderSMX tOrderSMX);
}
