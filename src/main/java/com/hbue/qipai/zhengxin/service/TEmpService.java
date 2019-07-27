package com.hbue.qipai.zhengxin.service;

import com.hbue.qipai.zhengxin.entity.TEmp;

import java.util.List;

public interface TEmpService {
    //查询所有员工
    List<TEmp> queryTEmpAll();
    //根据id删除员工
    void deleteTEmp(Integer EId);
    //根据id查询单个员工
    TEmp getTEmpById(Integer EId);
    //修改单条员工数据
    void updateTEmp(TEmp tEmp);
    //添加一条员工数据
    void addTEmp(TEmp tEmp);
}
