package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TClient;
import com.hbue.qipai.zhengxin.mapper.ClientMapper;
import com.hbue.qipai.zhengxin.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    //创建持久层
    @Autowired
    ClientMapper clientMapper;



    @Override
    public List<TClient> queryAllClient() {
        return clientMapper.queryAllClient();
    }

    @Override
    public void deleteClient(Integer id) {
         clientMapper.deleteClient(id);
    }

    @Override
    public void updateClient(TClient tClient) {
         clientMapper.updateClient(tClient);
    }

    @Override
    public void addClient(TClient tClient) {
          clientMapper.addClient(tClient);
    }

    @Override
    public TClient getClientById(Integer id) {
        return clientMapper.getClientById(id);
    }

    @Override
    public List<TClient> queryDelClient() {
        return clientMapper.queryDelClient();
    }

    @Override
    public void recoverClient(Integer id) {
        clientMapper.recoverClient(id);
    }
}
