package com.cxb.controller;

import com.cxb.entity.Obj;
import com.cxb.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author omen
 * @create 2021-05-07-22:17
 */
@RestController
@Slf4j
public class Controller8001 {

    @GetMapping("/hello")
    public  R hello() {
        return new R(200,"hello",null);
    }
    public R create(Obj obj) {
        log.info(obj.toString());
        return new R(200,"ok",null);
    }

}
