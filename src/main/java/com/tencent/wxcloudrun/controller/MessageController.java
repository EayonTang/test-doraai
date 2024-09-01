package com.tencent.wxcloudrun.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: tangyh
 * @date: 2024/9/1
 * @description:
 */
@RestController
public class MessageController {


    @RequestMapping("/message")
    public void message(@RequestBody String message){
        System.out.println(message);
    }
}
