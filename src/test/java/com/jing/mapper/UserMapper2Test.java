package com.jing.mapper;

import com.jing.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName:UserMapper2Test
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/25 17:42
 * @Version 1.0
 */
//mybatis+Spring整合测试
public class UserMapper2Test {
    @Test
    public void queryUserById() throws IOException {
        //加载spring配置文件生成applicationContext
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        /*SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)applicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);*/
        //从ioc容器中获取mapper
        //通过id获取（装配单个Mapper方式）
        //UserMapper userMapper =(UserMapper) applicationContext.getBean("userMapper");

        //通过字节码来直接获取UserMapper
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        User user = userMapper.queryUserById(1l);
        System.out.println(user);
    }
}
