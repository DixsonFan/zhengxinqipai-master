package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TProductyear;
import com.hbue.qipai.zhengxin.service.TProductyearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 控制层
 */
@Controller
@RequestMapping("/t_productyear")
public class ProductyearController {
    //创建服务层对象
    @Autowired
    private TProductyearService tProductyearService;

    @RequestMapping("/queryTProductyearAll")
    public String  queryTProductyearAll(Model model){
        //查询所有部门
        List<TProductyear> tProductyearList=tProductyearService.queryTProductyearAll();
        model.addAttribute("tProductyearList",tProductyearList);
        return "/tProductyear/list";
    }

    //删除
    @RequestMapping("/deleteTProductyear/{YId}")
    public String  deleteTProductyear(@PathVariable Integer YId){
        //使用服务层的方法删除数据
        tProductyearService.deleteTProductyear(YId);
        //重定向到查全部
        return "redirect:/tProductyear/queryTProductyearAll";
    }

    //修改
    @RequestMapping("/updatePageTProductyear/{YId}")
    public String updatePageTProductyear(@PathVariable Integer YId, Model model) {
        TProductyear tProductyear = tProductyearService.getTProductyearById(YId);
        model.addAttribute("tProductyear", tProductyear);
        return "/tProductyear/update";
    }

    //修改
    @RequestMapping("/update")
    public String update(Integer YId,Integer PId,String YName,Integer YPrice) {
        TProductyear tProductyear = new TProductyear(YId,PId,YName,YPrice);
        tProductyearService.updateTProductyear(tProductyear);
        //System.out.println(tProductyear);
        return "redirect:/tProductyear/queryTProductyearAll";
    }

    //添加页面跳转
    @RequestMapping("/addPageTProductyear")
    public String addPageTProductyear() {
        return "/tProductyear/add";
    }

    //添加
    @RequestMapping("/addTProductyear")
    public String addTProductyear(Integer PId,String YName,Integer YPrice, Model model) {
        TProductyear tProductyear = new TProductyear(PId,YName,YPrice);
        tProductyearService.addTProductyear(tProductyear);
        return "redirect:/tProductyear/queryTProductyearAll";
    }
}
