package com.zzw.controller;

import com.zzw.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Author: Daydreamer
 * Date:2019/10/13
 */

// 服务消费者不需要关心服务是如何提供的，只需要使用
// 所以不需要service，而是直接通过RestTemplate进行服务的消费
// 使用RestTemplate进行rest接口调用，同spring提供的JDBCTemplate和RedisTemplate
// 把rest调用又封装了一层，远程访问http服务（http client）
@RestController(value = "/consumer/dept")
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http:localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    // 后面不加method说明几种方法都可以访问到
    @RequestMapping(value = "/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(
                REST_URL_PREFIX + "/dept/add",
                dept,
                Boolean.class);
    }

    @RequestMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(
                REST_URL_PREFIX + "/dept/get/" + id,
                Dept.class);
    }

    @PostMapping
    @RequestMapping(value = "/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(
                REST_URL_PREFIX + "/dept/list",
                List.class);
    }

}
