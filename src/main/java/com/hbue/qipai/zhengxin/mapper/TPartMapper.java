package com.hbue.qipai.zhengxin.mapper;

import com.hbue.qipai.zhengxin.entity.TPart;
import java.util.List;

public interface TPartMapper {
    //查询所有部门
    List<TPart> queryTPartAll();
    //根据id删除部门
    void deleteTPart(Integer PId);
    //根据id查询单个部门
    TPart getTPartById(Integer PId);
    //修改单条部门数据
    void updateTPart(TPart tPart);
    //添加一条部门数据
    void addTPart(TPart tPart);
}
