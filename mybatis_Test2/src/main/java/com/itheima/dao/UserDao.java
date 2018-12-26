package com.itheima.dao;

import com.itheima.pojo.Student;

import java.util.List;

public interface UserDao {
    List<Student> queryStudentList() throws  Exception;

}
