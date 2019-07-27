package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TSort;
import com.hbue.qipai.zhengxin.service.TSortService;
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
@RequestMapping("/t_sort")
public class SortController {
    //创建服务层对象
    @Autowired
    private TSortService tSortService;

    @RequestMapping("/queryTSortAll")
    public String  queryTSortAll(Model model){
        //查询所有部门
        List<TSort> tSortList=tSortService.queryTSortAll();
        model.addAttribute("tSortList",tSortList);
        return "/tSort/list";
    }

    //删除
    @RequestMapping("/deleteTSort/{SId}")
    public String  deleteTSort(@PathVariable Integer SId){
        //使用服务层的方法删除数据
        tSortService.deleteTSort(SId);
        //重定向到查全部
        return "redirect:/tSort/queryTSortAll";
    }

    //修改
    @RequestMapping("/updatePageTSort/{SId}")
    public String updatePageTSort(@PathVariable Integer SId, Model model) {
        TSort tSort = tSortService.getTSortById(SId);
        model.addAttribute("tSort", tSort);
        return "/tSort/update";
    }

    //修改
    @RequestMapping("/update")
    public String update(Integer SId,String SName,String SRemark,Integer SIs) {
        TSort tSort = new TSort(SId,SName,SRemark,SIs);
        tSortService.updateTSort(tSort);
        //System.out.println(tSort);
        return "redirect:/tSort/queryTSortAll";
    }

    //添加页面跳转
    @RequestMapping("/addPageTSort")
    public String addPageTSort() {
        return "/tSort/add";
    }

    //添加
    @RequestMapping("/addTSort")
    public String addTSort(String SName,String SRemark,Integer SIs, Model model) {
        TSort tSort = new TSort(SName,SRemark,SIs);
        tSortService.addTSort(tSort);
        return "redirect:/tSort/queryTSortAll";
    }
}
