package org.yuntao.website.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoyuntao on 2019/1/19.
 */
@RestController
public class WebApiController {



    @RequestMapping("/hello")
    public String hello(){
        return "Hello,World";
    }
}
