package com.kgc.myprovider1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李晓光
 * @version 0.0.1
 * @Description 描述
 * @date 2019/10/17 15:36
 */
@RestController
public class ProviderController {

    @RequestMapping("index")
    public String bb(String uname){


        System.out.println(" return uname");
        return uname+"这是我的provider";
    }
}


