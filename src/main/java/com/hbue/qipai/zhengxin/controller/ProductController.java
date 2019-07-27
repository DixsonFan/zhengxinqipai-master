package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TProduct;
import com.hbue.qipai.zhengxin.service.TProductService;
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
@RequestMapping("/t_product")
public class ProductController {
    //创建服务层对象
    @Autowired
    private TProductService tProductService;

    @RequestMapping("/queryTProductAll")
    public String  queryTProductAll(Model model){
        //查询所有部门
        List<TProduct> tProductList=tProductService.queryTProductAll();
        model.addAttribute("tProductList",tProductList);
        return "/tProduct/list";
    }

    //删除
    @RequestMapping("/deleteTProduct/{PId}")
    public String  deleteTProduct(@PathVariable Integer PId){
        //使用服务层的方法删除数据
        tProductService.deleteTProduct(PId);
        //重定向到查全部
        return "redirect:/tProduct/queryTProductAll";
    }

    //修改
    @RequestMapping("/updatePageTProduct/{PId}")
    public String updatePageTProduct(@PathVariable Integer PId, Model model) {
        TProduct tProduct = tProductService.getTProductById(PId);
        model.addAttribute("tProduct", tProduct);
        return "/tProduct/update";
    }

    //修改
    @RequestMapping("/update")
    public String update(Integer PId,Integer SId,String PName,
                         String PArea,String PMl,Integer PIs) {
        TProduct tProduct = new TProduct(PId,SId,PName,PArea,PMl,PIs);
        tProductService.updateTProduct(tProduct);
        //System.out.println(tProduct);
        return "redirect:/tProduct/queryTProductAll";
    }

    //添加页面跳转
    @RequestMapping("/addPageTProduct")
    public String addPageTProduct() {
        return "/tProduct/add";
    }

    //添加
    @RequestMapping("/addTProduct")
    public String addTProduct(Integer SId,String PName,String PArea,
                              String PMl,Integer PIs, Model model) {
        TProduct tProduct = new TProduct(SId,PName,PArea,PMl,PIs);
        tProductService.addTProduct(tProduct);
        return "redirect:/tProduct/queryTProductAll";
    }
}
