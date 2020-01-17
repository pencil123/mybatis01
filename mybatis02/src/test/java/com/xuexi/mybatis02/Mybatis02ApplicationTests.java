package com.xuexi.mybatis02;
import com.xuexi.mybatis02.entity.Employee;
import com.xuexi.mybatis02.dao.EmployeeMapper;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@MapperScan("classpath:/mappers/*.xml")
class Mybatis02ApplicationTests {

  @Test
  void contextLoads() {}

  @Autowired
  private EmployeeMapper employeeMapper;


  @Test
  public void test03() throws IOException {
   Employee employee =  employeeMapper.getEmpById(1);
    System.out.println(employee.toString());
  }

}
