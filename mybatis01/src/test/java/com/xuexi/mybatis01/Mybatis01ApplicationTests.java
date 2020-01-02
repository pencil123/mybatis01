package com.xuexi.mybatis01;

import com.xuexi.mybatis01.dao.EmployeeMapper;
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


  static SqlSessionFactory getSessionFactory() throws IOException{
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    return sqlSessionFactory;
  }

  @Test
  /**
   * 使用类的方式
   */
  void test() throws IOException {
    SqlSessionFactory sqlSessionFactory = getSessionFactory();
    SqlSession openSeesion = sqlSessionFactory.openSession();
    Employee employee = openSeesion.selectOne("com.xuexi.mybatis01.dao.EmployeeMapper.getEmpById", 1);
    System.out.println(employee);
    openSeesion.close();
  }

  @Test
  /**
   * 使用接口的方式
   */
  public void test01() throws  IOException{
    SqlSessionFactory sqlSessionFactory = getSessionFactory();
    SqlSession openSeesion = sqlSessionFactory.openSession();
    EmployeeMapper mapper = openSeesion.getMapper(EmployeeMapper.class);
    Employee employee = mapper.getEmpById(1);
    System.out.println(employee);
  }
}
