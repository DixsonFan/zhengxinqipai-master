package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TOrderSMX;
import com.hbue.qipai.zhengxin.service.OrderSMXSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ordersmx")
public class OrderSMXController {
    //创建服务层对象
    @Autowired
    private OrderSMXSerivice orderSMXSerivice;
    @RequestMapping("/queryAllClient")
    public String  queryAllClient(Model model){
        //查询所有员工
        List<TOrderSMX> orderSMXList=orderSMXSerivice.queryAllOrderSMX();
        model.addAttribute("orderSMXList",orderSMXList);
        return "/ordersmx/list";
    }

    //没有删除
}
