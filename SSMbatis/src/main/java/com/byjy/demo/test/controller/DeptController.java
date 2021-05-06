package com.byjy.demo.test.controller;

import com.byjy.demo.test.bean.Dept;
import com.byjy.demo.test.mapper.IDeptMapper;
import com.byjy.demo.test.service.IDeptService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
public class DeptController {
    @Autowired
    private IDeptService deptService;


    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void test1() throws IOException {
// 1、获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
        // 2、获取sqlSession对象
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            // 3、获取接口的实现类对象
            //会为接口自动的创建一个代理对象，代理对象去执行增删改查方法
            IDeptMapper mapper = openSession.getMapper(IDeptMapper.class);
//            List<Dept> dept = mapper.getDept();
//            System.out.println("dept = " + dept);
            Dept byDeptId = mapper.getByDeptId(1);
            System.out.println(byDeptId);
            System.out.println(byDeptId.getEmpList());

        } finally {
            openSession.close();
        }
    }
}
