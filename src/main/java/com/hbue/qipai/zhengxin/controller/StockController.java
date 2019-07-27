package com.hbue.qipai.zhengxin.controller;


import com.hbue.qipai.zhengxin.entity.TStock;
import com.hbue.qipai.zhengxin.mapper.StockMapper;
import com.hbue.qipai.zhengxin.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stock")
public class StockController {



    //创建服务层对象
    @Autowired
    private StockService stockService;
    @RequestMapping("/queryAllStock")
    public String  queryAllStock(Model model){
        //查询所有员工
        List<TStock> stockList=stockService.queryAllStock();
        model.addAttribute("stockList",stockList);
        return "/stock/list";
    }

    @RequestMapping("/addStock")
    public String  addStock(){

        TStock tStock = new TStock(2,3);
        stockService.addStock(tStock);
        //查全部
        return "redirect:/stock/queryAllStock";
    }
}
