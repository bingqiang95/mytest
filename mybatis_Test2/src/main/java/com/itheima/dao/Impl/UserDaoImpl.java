package com.itheima.dao.Impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }
    @Override
    public List<Student> queryStudentList() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Student> student = sqlSession.selectList("test.queryStudentList");
        return student;
    }
}
