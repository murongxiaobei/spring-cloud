package com.example.demo.dao.daoImpl;

import com.example.demo.dao.BlogDao;
import com.example.demo.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class BlogDaoImpl implements BlogDao{

    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Blog blog,String collection) {
        mongoTemplate.save(blog,collection);
    }

    @Override
    public void save(Blog blog) {
        mongoTemplate.save(blog);
    }

    @Override
    public Blog findBlogByTopic(String topic) {
        Query query=new Query(Criteria.where("topic").is(topic));
        Blog blog =  mongoTemplate.findOne(query , Blog.class);
        return blog;
    }

    @Override
    public void update(Blog blog) {
        Query query=new Query(Criteria.where("id").is(blog.getId()));
        Update update= new Update().set("topic", blog.getTopic()).set("content", blog.getContent())
                .set("createTime",blog.getCreateTime());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query,update,Blog.class);
    }

    @Override
    public void deleteBlogById(Long id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Blog.class);
    }
}
