package com.lt.test;

import com.lt.dao.AppointmentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest
{
    public static void main(String[] args)
        throws IOException
    {
        InputStream is = Resources.getResourceAsStream("spring/spring-dao.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        sqlSession.getMapper(AppointmentDao.class);
    }
}
