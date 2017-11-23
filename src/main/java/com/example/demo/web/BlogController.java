package com.example.demo.web;

import com.example.demo.dao.BlogDao;
import com.example.demo.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogDao blogDao;

    @RequestMapping("/save")
    public Object save() {
        Blog blog = new Blog();
        blog.setId(4L);
        blog.setTopic("产品");
        blog.setContent("OPPO首创了“星幕屏”设计，感官上非常出色。" +
                "2000万+1600万智选双摄，两个摄像头都是主镜头，都配备f/1.7大光圈。" +
                "和《王者荣耀》联合，开发了多核多线程和智能场景识别技术，游戏性能爆表。");
        blog.setCreateTime(new Date());
        blogDao.save(blog);
        return "ok";
    }

   @RequestMapping("/findBlogByTopic")
    public Object findBlogByTopic(){
        Blog blog = blogDao.findBlogByTopic("科技专区");
        return blog;
    }

    @RequestMapping("/update")
    public Object update(){
        Blog blog = new Blog();
        blog.setId(1L);
        blog.setTopic("科技专区");
        blog.setContent("昨晚宣布：国家大力支持人工智能发展，百度阿里腾讯科大讯飞双双入选");
        blog.setCreateTime(new Date());
        blogDao.update(blog);
        return "OK";
    }

    @RequestMapping("/deleteBlogById")
    public void deleteBlogById(){
        blogDao.deleteBlogById(3L);
    }
}
