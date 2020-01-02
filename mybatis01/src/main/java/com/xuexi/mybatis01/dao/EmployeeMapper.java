package com.xuexi.mybatis01.dao;

import com.xuexi.mybatis01.entity.Employee;

/**
 * @author lyzhang
 * @since 2020/1/2 16:22
 */
public interface EmployeeMapper {
  public Employee getEmpById (Integer id);
}
