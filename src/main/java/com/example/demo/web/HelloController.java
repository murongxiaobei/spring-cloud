package com.example.demo.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;


@RestController
@RequestMapping("/hello")
public class HelloController {
    protected static Logger logger= LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String index() {
        logger.debug("访问hello");
        return "hello";
    }

    @RequestMapping("/hello/{name}")
    public String hellName(@PathVariable String name) {
        logger.debug("访问helloName,Name={}",name);
        return "Hello " + name;
    }
    @RequestMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}