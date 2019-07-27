package com.hbue.qipai.zhengxin.service.impl;

import com.hbue.qipai.zhengxin.entity.TSort;
import com.hbue.qipai.zhengxin.mapper.TSortMapper;
import com.hbue.qipai.zhengxin.service.TSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务层的实现类
 */
@Service
public class TSortServiceImpl implements TSortService {
    //创建持久层
    @Autowired
    private TSortMapper tSortMapper;

    @Override
    public List<TSort> queryTSortAll() {
        return tSortMapper.queryTSortAll();
    }

    @Override
    public void deleteTSort(Integer SId) {
        tSortMapper.deleteTSort(SId);
    }

    @Override
    public TSort getTSortById(Integer SId) {
        return tSortMapper.getTSortById(SId);
    }

    @Override
    public void updateTSort(TSort tSort) {
        tSortMapper.updateTSort(tSort);
    }

    @Override
    public void addTSort(TSort tSort) {
        tSortMapper.addTSort(tSort);
    }
}
