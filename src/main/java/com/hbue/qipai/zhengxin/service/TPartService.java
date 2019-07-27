package com.hbue.qipai.zhengxin.service;


import com.hbue.qipai.zhengxin.entity.TPart;

import java.util.List;

/**
 * 服务层
 */
public interface TPartService {
    //查询所有部门
    List<TPart> queryTPartAll();
    //根据id删除部门
    void deleteTPart(Integer Pid);
    //根据id查询单个部门
    TPart getTPartById(Integer Pid);
    //修改单条部门数据
    void updateTPart(TPart tPart);
    //添加一条部门数据
    void addTPart(TPart tPart);
}
