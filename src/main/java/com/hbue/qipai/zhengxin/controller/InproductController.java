package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TInproduct;
import com.hbue.qipai.zhengxin.service.TInproductService;
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
@RequestMapping("/t_inproduct")
public class InproductController {
    //创建服务层对象
    @Autowired
    private TInproductService tInproductService;

    @RequestMapping("/queryTInproductAll")
    public String  queryTInproductAll(Model model){
        //查询所有部门
        List<TInproduct> tInproductList=tInproductService.queryTInproductAll();
        model.addAttribute("tInproductList",tInproductList);
        return "/tInproduct/list";
    }

    //删除
    @RequestMapping("/deleteTInproduct/{DId}")
    public String  deleteTInproduct(@PathVariable Integer DId){
        //使用服务层的方法删除数据
        tInproductService.deleteTInproduct(DId);
        //重定向到查全部
        return "redirect:/tInproduct/queryTInproductAll";
    }

    //修改
    @RequestMapping("/updatePageTInproduct/{DId}")
    public String updatePageTInproduct(@PathVariable Integer DId, Model model) {
        TInproduct tInproduct = tInproductService.getTInproductById(DId);
        model.addAttribute("tInproduct", tInproduct);
        return "/tInproduct/update";
    }

    //修改
    @RequestMapping("/update")
    public String update(Integer DId,Integer PId,
                         Integer EId,String DRemark,
                         Integer DInteger,String DTime) {
        TInproduct tInproduct = new TInproduct(DId,PId,EId,DRemark,DInteger,DTime);
        tInproductService.updateTInproduct(tInproduct);
        //System.out.println(tInproduct);
        return "redirect:/tInproduct/queryTInproductAll";
    }

    //添加页面跳转
    @RequestMapping("/addPageTInproduct")
    public String addPageTInproduct() {
        return "/tInproduct/add";
    }

    //添加
    @RequestMapping("/addTInproduct")
    public String addTInproduct(Integer PId,Integer EId,String DRemark,
                                Integer DInteger,String DTime, Model model) {
        TInproduct tInproduct = new TInproduct(PId,EId,DRemark,DInteger,DTime);
        tInproductService.addTInproduct(tInproduct);
        return "redirect:/tInproduct/queryTInproductAll";
    }
}
