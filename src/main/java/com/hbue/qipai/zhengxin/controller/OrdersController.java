package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TOrders;
import com.hbue.qipai.zhengxin.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    //创建服务层对象
    @Autowired
    private OrdersService ordersService;
    @RequestMapping("/queryAllOrders")
    public String  queryAllClient(Model model){
        //查询所有员工
        List<TOrders> ordersList=ordersService.queryAllOrders();
        model.addAttribute("ordersList",ordersList);
        return "/orders/orders01";
    }

    //删除
    @RequestMapping("/deleteOrders/{id}")
    public String  deleteEmp(@PathVariable Integer id){
        //使用服务层的方法删除数据
        ordersService.deleteOrders(id);
        //重定向到查全部
        return "redirect:/orders/queryAllOrders";
    }

}
