package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TEmp;
import com.hbue.qipai.zhengxin.mapper.TEmpMapper;
import com.hbue.qipai.zhengxin.service.TEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务层的实现类
 */
@Service
public class TEmpServiceImpl implements TEmpService {
    //创建持久层
    @Autowired
    private TEmpMapper tEmpMapper;

    @Override
    public List<TEmp> queryTEmpAll() {
        return tEmpMapper.queryTEmpAll();
    }

    @Override
    public void deleteTEmp(Integer EId) {
        tEmpMapper.deleteTEmp(EId);
    }

    @Override
    public TEmp getTEmpById(Integer EId) {
        return tEmpMapper.getTEmpById(EId);
    }

    @Override
    public void updateTEmp(TEmp tEmp) {
        tEmpMapper.updateTEmp(tEmp);
    }

    @Override
    public void addTEmp(TEmp tEmp) {
        tEmpMapper.addTEmp(tEmp);
    }
}
