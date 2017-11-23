package com.example.demo.web;

import com.example.demo.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/redis")
public class RedisController {

    protected static Logger logger= LoggerFactory.getLogger(RedisController.class);

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;

//    @Resource(name="stringRedisTemplate")
//    ValueOperations<String,String> valOpsStr;

    @RequestMapping("set")
    public String setKeyAndValue(String key,String value){
        logger.debug("访问set:key={},value={}",key,value);
        ValueOperations<String, String> operations=redisTemplate.opsForValue();
        operations.set(key, value);
        return "Set Ok";
    }

    @RequestMapping("get")
    public String getKey(String key){
        logger.debug("访问get:key={}",key);
        ValueOperations<String, String> operations=redisTemplate.opsForValue();
        String value =  operations.get(key);
        return value;
    }

    @RequestMapping("/setPerson")
    public void setPerson(String id,String name,Integer age){
        logger.debug("访问setPerson:id={},name={},age={}",id,name,age);
        Person person = new Person(id, name, age);
        ValueOperations<String, Person> operations=redisTemplate.opsForValue();
        operations.set("com.person."+id, person,60, TimeUnit.SECONDS);
        //redisTemplate.delete("com.neo.f");
//        boolean exists=redisTemplate.hasKey("com.neo.f");
//        if(exists){
//            System.out.println("exists is true");
//        }else{
//            System.out.println("exists is false");
//        }
    }

    @RequestMapping("/getPerson")
    public Object getPerson(String id){
        ValueOperations<String, Person> operations=redisTemplate.opsForValue();
        Person person = operations.get("com.person."+id);
        boolean exists=redisTemplate.hasKey("com.person."+id);
        if(exists){
            return person;
        }else{
            return "exists is false";
        }
    }
}
