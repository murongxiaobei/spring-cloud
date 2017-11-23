package com.example.demo.dao;

import com.example.demo.entity.Blog;

public interface  BlogDao {

    public void save(Blog blog) ;

    public void save(Blog blog,String collection) ;

    public Blog findBlogByTopic(String topic) ;


    public void update(Blog blog);


    public void deleteBlogById(Long id) ;
}
