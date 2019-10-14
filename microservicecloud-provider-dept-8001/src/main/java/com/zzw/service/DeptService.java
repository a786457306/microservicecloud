package com.zzw.service;

import com.zzw.entities.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Daydreamer
 * Date:2019/10/13
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
