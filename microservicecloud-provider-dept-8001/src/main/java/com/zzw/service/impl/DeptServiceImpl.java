package com.zzw.service.impl;

import com.zzw.dao.DeptDao;
import com.zzw.entities.Dept;
import com.zzw.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Daydreamer
 * Date:2019/10/13
 */
// 标记的目的是创建bean，即创建新对象，所以标记在实现类上而非接口层
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }
}
