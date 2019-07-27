package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TOutProduct;
import com.hbue.qipai.zhengxin.service.OutProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/outproduct")
public class OutProductController {

    //创建服务层对象
    @Autowired
    private OutProductService outProductService;
    @RequestMapping("/queryAllOutProduct")
    public String  queryAllPart(Model model){
        //查询所有员工
        List<TOutProduct> outProductList=outProductService.queryAllOutProduct();
        model.addAttribute("outProductList",outProductList);
        return "/outproduct/list";
    }

    //没有删除
}
