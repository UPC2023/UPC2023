package com.example.d01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data  //自动生成类属性的set/get方法
//@AllArgsConstructor //自动生成全参构造方法
//@NoArgsConstructor //自动生成无参构造方法
public class User {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;

    public User(Integer id, String gender, String name, Integer age) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
