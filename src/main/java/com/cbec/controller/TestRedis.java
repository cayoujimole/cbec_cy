package com.cbec.controller;

import com.cbec.config.redis.RedisClient;
import com.cbec.model.UserInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRedis {

    @Autowired
    private RedisClient redisUtils;
    @Autowired
    private ObjectMapper m;

    @RequestMapping(value = "/putRedis",method = RequestMethod.POST,consumes="application/json")
    public String  putRedis(@RequestParam String key, @RequestParam String name, @RequestParam String password){
        UserInfo u = new UserInfo();
        u.setId(key);
        u.setSmtpUsername(name);
        u.setSmtpPassword(password);
        String str = "500";
        try {
            redisUtils.set(key, m.writeValueAsString(u));
            System.out.println("进入了方法");
            Object obj= redisUtils.get("key");
            str = m.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }

    @RequestMapping(value = "/getRedis",method = RequestMethod.POST,consumes="application/json")
    public String  getRedis(@RequestParam String key){
        System.out.println("进入了方法");
        try {
            return m.writeValueAsString(redisUtils.get(key));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "500";
    }

    @RequestMapping(value = "/getGetRedis",method = RequestMethod.GET,consumes="application/json")
    public String  getGetRedis(@RequestParam String key){
        System.out.println("进入了方法");
        try {
            return m.writeValueAsString(redisUtils.get(key));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "500";
    }

//    @Autowired
//    JedisPool jedisPool;
//
    public static void main(String[] args) {

//        JedisPool jedisPool = new JedisPool();
//        Jedis j = jedisPool.getResource();
//        System.out.println("@@@@@@@@@@@: "+j.setex("setexKey", 20, "21321"));

        RedisClient redisClient = new RedisClient();
        try {
            redisClient.set("redis_key", "abc");
            String value=redisClient.setex("setexKey", 10, "2132341");
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
