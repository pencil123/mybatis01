package com.xuexi.mybatis01;

import com.xuexi.mybatis01.entity.Employee;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mybatis01ApplicationTests {

  @Test
  void contextLoads() {}

  @Test
  void test() throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession openSeesion = sqlSessionFactory.openSession();


    Employee employee = openSeesion.selectOne("com.xuexi.mybatis01.EmployeeMapper.selectEmp", 1);
    System.out.println(employee);


    openSeesion.close();
  }
}
