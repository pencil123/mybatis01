package com.xuexi.mybatis01.entity;

/**
 * @author lyzhang
 * @since 2020/1/2 14:19
 */


public class Employee {
  private Integer id;
  private String last_name;
  private String email;
  private String gender;

  public Employee() {
    super();
  }

  public Employee(Integer id, String last_name, String email, String gender) {
    this.id = id;
    this.last_name = last_name;
    this.email = email;
    this.gender = gender;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", last_name='" + last_name + '\'' +
        ", email='" + email + '\'' +
        ", gender='" + gender + '\'' +
        '}';
  }
}
