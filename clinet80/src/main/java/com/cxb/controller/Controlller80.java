package com.cxb.controller;

import com.cxb.entity.Obj;
import com.cxb.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author omen
 * @create 2021-05-07-22:38
 */
@RestController
@Slf4j
public class Controlller80 {

    private static final String URL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public R hello() {
        return restTemplate.getForObject(URL+"/hello",R.class);
    }

    @GetMapping("/test1")
    public R test1() {
        Obj hahaha = new Obj(1, "hahaha");
        return restTemplate.postForObject(URL+"/post",hahaha,R.class);
    }
}
