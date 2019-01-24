package com.killer.common.im.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@description
 *@author killer
 *@date 2019/01/24 - 14:15
 */

@RestController
@RequestMapping("im")
public class TestController {
    @RequestMapping("test")
    public String hello() {
        return "hello world";
    }
}
