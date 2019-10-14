package com.zzw.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 实现序列化接口
 * 接口里没有实际内容，只是标记该对象可被序列化
 *
 * 其他模块使用到这个类直接引用即可
 *
 * Author: Daydreamer
 * Date:2019/10/11
 */

// 无参构造方法
@NoArgsConstructor
// 全参构造方法
@AllArgsConstructor
@Data
// 链式风格，setter方法返回对象
// dept.setDeptno().setDname().setDb_source();
@Accessors(chain = true)
public class Dept implements Serializable {

    // 主键
    private Long deptno;

    // 部门名称
    private String dname;

    // 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String db_source;

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }
}
