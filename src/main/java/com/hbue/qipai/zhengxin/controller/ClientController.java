package com.hbue.qipai.zhengxin.controller;

import com.hbue.qipai.zhengxin.entity.TClient;
import com.hbue.qipai.zhengxin.mapper.ClientMapper;
import com.hbue.qipai.zhengxin.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {

    //创建服务层对象
    @Autowired
    private ClientService clientService;



    @RequestMapping("/queryAllClient")
    public String  queryAllClient(Model model){
        //查询所有员工
        List<TClient> clientList=clientService.queryAllClient();
        model.addAttribute("clientList",clientList);


        return "/client/client01";
    }

    //删除
    @RequestMapping("/deleteClient/{id}")
    public String  deleteClient(@PathVariable Integer id){
        //使用服务层的方法删除数据
        clientService.deleteClient(id);
        //重定向到查全部
        return "redirect:/client/queryAllClient";
    }

    //增加
    @RequestMapping("/addClient")
    public String addClient(@RequestParam("cname") String cname,@RequestParam("ctel") String ctel,@RequestParam("caddress") String caddress)
    {

        TClient client = new TClient(5,9,cname,ctel,caddress,1);
        clientService.addClient(client);
        return "redirect:/client/queryAllClient";
    }

    //update
    @RequestMapping("/updateClient/{cid}")
    public String updateClient(@PathVariable Integer cid, @RequestParam("cname")String cname,@RequestParam("ctel")String ctel,@RequestParam("caddress")String caddress)
    {
        System.out.println(">>>>>>>>>>");
        System.out.println("cid = " + cid);
        TClient client = new TClient(2,cid,cname,ctel,caddress,1);
        clientService.updateClient(client);
        System.out.println("修改成功"+cname+"id"+cid);
        return "redirect:/client/queryAllClient";
    }

    //查找已经删除的客户
    @RequestMapping("/queryDelClient")
    public String  queryDelClient(Model model){
        //查询所有员工
        List<TClient> clientList1=clientService.queryDelClient();
        model.addAttribute("clientList1",clientList1);
        System.out.println("查找已删除客户成功");
        return "/client/client02";
    }
    //recover
    @RequestMapping("/recoverClient/{id}")
    public String  recoverClient(@PathVariable Integer id){
        //使用服务层的方法删除数据
        clientService.recoverClient(id);
        //重定向到查全部
        return "redirect:/client/queryAllClient";
    }

}
