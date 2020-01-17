package com.xuexi.mybatis02.dao;

import com.xuexi.mybatis02.entity.Employee;

/**
 * @author lyzhang
 * @since 2020/1/15 16:01
 */

public interface EmployeeMapper {
  public Employee getEmpById (Integer id);

  public void addEmp(Employee employee);

  public void updateEmp(Employee employee);

  public void deleteEmpById(Integer id);
}
