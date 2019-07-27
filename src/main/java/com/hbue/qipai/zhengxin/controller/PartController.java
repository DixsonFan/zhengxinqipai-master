package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TPart;
import com.hbue.qipai.zhengxin.service.TPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 控制层
 */
@Controller
@RequestMapping("/t_part")
public class PartController {
    //创建服务层对象
    @Autowired
    private TPartService tPartService;

    @RequestMapping("/queryTPartAll")
    public String  queryTPartAll(Model model){
        //查询所有部门
        List<TPart> tPartList=tPartService.queryTPartAll();
        model.addAttribute("tPartList",tPartList);
        for(int i = 0; i<tPartList.size();i++){
            System.out.println(tPartList.get(i));
        }
        return "tPart/part01";
    }

    //删除
    @RequestMapping("/deleteTPart/{PId}")
    public String  deleteTPart(@PathVariable Integer PId){
        //使用服务层的方法删除数据
        tPartService.deleteTPart(PId);
        //重定向到查全部
        return "redirect:/tPart/queryTPartAll";
    }

    //修改
    @RequestMapping("/updatePageTPart/{PId}")
    public String updatePageTPart(@PathVariable Integer PId, Model model) {
        TPart tPart = tPartService.getTPartById(PId);
        model.addAttribute("tPart", tPart);
        return "/tPart/update";
    }

    //修改
    @RequestMapping("/update")
    public String update( HttpServletRequest request) {
        int PId = Integer.parseInt(request.getParameter("PId"));
        String partName = request.getParameter("partName");
        String partNote = request.getParameter("partNote");
        TPart tPart = new TPart(PId, partName, partNote, null);
        System.out.println(tPart);
        tPartService.updateTPart(tPart);

        return "redirect:/tPart/queryTPartAll";
    }

    //添加
    @RequestMapping("/addTPart")
    public String addTPart(@RequestParam("sectionName") String sectionName,@RequestParam("sectionNote") String sectionNote) {
        TPart tPart = new TPart(sectionName, sectionNote, 1);
        tPartService.addTPart(tPart);
        return "redirect:/t_part/queryTPartAll";
    }
}
