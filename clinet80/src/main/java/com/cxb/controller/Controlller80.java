package com.cxb.controller;

import com.cxb.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author omen
 * @create 2021-05-07-22:38
 */
@RestController
@Slf4j
public class Controlller80 {

    private static final String URL = "http://localhost:8001";
    private RestTemplate restTemplate;

    public R hello() {
        return restTemplate.getForObject(URL+"/hello",R.class);
    }
}
