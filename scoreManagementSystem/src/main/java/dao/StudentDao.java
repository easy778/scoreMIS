package dao;

import pojo.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao extends Dao {


    //添加学生方法
    public boolean addStudent(Student student) throws SQLException;

    // 按id查询学生方法
    public Student findStudentById(String id) throws SQLException;

    // 查询所有学生方法
    public List<Student> findAllStudent() throws SQLException;

    // 按id删除学生方法
    public boolean deleteStudent(String studentId) throws SQLException;

    //修改学生信息
    public  boolean modifyStudent (Student student) throws SQLException;
}

