package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TOrders;
import com.hbue.qipai.zhengxin.mapper.OrdersMapper;
import com.hbue.qipai.zhengxin.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl  implements OrdersService {
    //创建持久层
    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public List<TOrders> queryAllOrders() {
        return ordersMapper.queryAllOrders();
    }

    @Override
    public void deleteOrders(Integer id) {
          ordersMapper.deleteOrders(id);
    }

    @Override
    public void updateOrders(TOrders tOrders) {
           ordersMapper.updateOrders(tOrders);
    }

    @Override
    public void addOrders(TOrders tOrders) {
        ordersMapper.addOrders(tOrders);

    }
}
