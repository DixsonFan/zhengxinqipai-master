package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TOrderSMX;
import com.hbue.qipai.zhengxin.mapper.OrderSMXMapper;
import com.hbue.qipai.zhengxin.mapper.OrdersMapper;
import com.hbue.qipai.zhengxin.service.OrderSMXSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSMXServiceImpl implements OrderSMXSerivice {
    //创建持久层
    @Autowired
    OrderSMXMapper orderSMXMapper;



    @Override
    public List<TOrderSMX> queryAllOrderSMX() {
        return orderSMXMapper.queryAllOrderSMX();
    }

    @Override
    public void deleteOrderSMX(Integer id) {
        orderSMXMapper.deleteOrderSMX(id);
    }

    @Override
    public void updateOrderSMX(TOrderSMX tOrderSMX) {
              orderSMXMapper.updateOrderSMX(tOrderSMX);
    }

    @Override
    public void addOrderSMX(TOrderSMX tOrderSMX) {
             orderSMXMapper.addOrderSMX(tOrderSMX);
    }
}
