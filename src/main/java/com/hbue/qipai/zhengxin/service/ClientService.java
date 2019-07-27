package com.hbue.qipai.zhengxin.service;

import com.hbue.qipai.zhengxin.entity.TClient;

import java.util.List;

public interface ClientService {

    //查询所有客户
    List<TClient> queryAllClient();
    //根据id删除
    void deleteClient(Integer id);

    //修改单条客户数据
    void updateClient(TClient tClient);
    //添加一条客户数据
    void addClient(TClient tClient);


    //按id查客户
    TClient getClientById(Integer id);

    //查已经删除客户
    List<TClient> queryDelClient();

    //恢复
    void recoverClient(Integer id);
}
