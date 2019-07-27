package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TEmp;
import com.hbue.qipai.zhengxin.service.TEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 控制层
 */
@Controller
@RequestMapping("/t_emp")
public class EmpController {
    //创建服务层对象
    @Autowired
    private TEmpService tEmpService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
       return "/tEmp/main";
    }

    @RequestMapping("/queryTEmpAll")
    public String  queryTEmpAll(Model model){
        //查询所有部门
        List<TEmp> tEmpList=tEmpService.queryTEmpAll();
        model.addAttribute("tEmpList",tEmpList);
        return "/tEmp/employee01";
    }

    //删除
    @RequestMapping("/deleteTEmp/{EId}")
    public String  deleteTEmp(@PathVariable Integer EId){
        //使用服务层的方法删除数据
        tEmpService.deleteTEmp(EId);
        //重定向到查全部
        return "redirect:/tEmp/queryTEmpAll";
    }

    //修改
    @RequestMapping("/updatePageTEmp/{EId}")
    public String updatePageTEmp(@PathVariable Integer EId, Model model) {
        TEmp tEmp = tEmpService.getTEmpById(EId);
        model.addAttribute("tEmp", tEmp);
        return "/tEmp/update";
    }

    //修改
    @RequestMapping("/update")
    public String update(Integer EId,Integer PId,String ELoginname,
                         String EPsw,String EImg,String ESex,Integer EFlag,
                         Integer EAdmin,String ERemark,String ETruename,Integer EIs) {
        TEmp tEmp = new TEmp(EId,PId,ELoginname,EPsw,EImg,ESex,EFlag,EAdmin,ERemark,ETruename,EIs);
        tEmpService.updateTEmp(tEmp);
        //System.out.println(tEmp);
        return "redirect:/tEmp/queryTEmpAll";
    }

    //添加页面跳转
    @RequestMapping("/addPageTEmp")
    public String addPageTEmp() {
        return "/tEmp/add";
    }

    //添加
    @RequestMapping("/addTEmp")
    public String addTEmp(Integer PId,String ELoginname,String EPsw,
                          String EImg,String ESex,Integer EFlag,Integer EAdmin,
                          String ERemark,String ETruename,Integer EIs, Model model) {
        TEmp tEmp = new TEmp(PId,ELoginname,EPsw,EImg,ESex,EFlag,EAdmin,ERemark,ETruename,EIs);
        tEmpService.addTEmp(tEmp);
        return "redirect:/tEmp/queryTEmpAll";
    }
}

