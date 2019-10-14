package com.zzw.dao;

import com.zzw.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: Daydreamer
 * Date:2019/10/13
 */

@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
