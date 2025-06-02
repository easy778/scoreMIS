package dao;

import pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    //登记学生信息
    public boolean addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO students(student_id,password,name,birthday,gender,major,department,role)  VALUES (?,?,?,?,?,?,?,?)";
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, student.getId());        //id
                pstmt.setString(2,"123456");             //初始化密码
                pstmt.setString(3, student.getName());      //姓名
                pstmt.setString(4, student.getBirthday());  //生日
                pstmt.setString(5, student.getGender());    //性别
                //pstmt.setString(6, student.getEmail());     //邮箱
                //pstmt.setString(7, student.getPhone());     //电话
                //pstmt.setString(8, student.getAddress());   //地址
                pstmt.setString(6, student.getMajor());
                pstmt.setString(7, student.getDepartment());//学院
                pstmt.setString(8, "student");
                pstmt.executeUpdate();
            return true;
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        }
    }

    // 按id查询学生信息
    public Student findStudentById(String id) throws SQLException {
        String sql = "SELECT *" +
                " FROM students WHERE student_id = ?";
        Student student = null;
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            try (
                    ResultSet rst = pstmt.executeQuery()) {
                if (rst.next()) {
                    student = new Student(rst.getString("student_id"), rst.getString("password"),rst.getString("role"),
                            rst.getString("password"), rst.getString("birthday"),
                            rst.getString("gender"), rst.getString("email"),
                            rst.getString("phone"), rst.getString("address"),
                            rst.getString("major"),rst.getString("department"));
                }
            }
        } catch (SQLException se) {
            return null;
        }
        return student;
    }

    public List<Student> findAllStudent() throws SQLException{
        String sql = "SELECT * FROM students ";
        List<Student> students = new ArrayList <Student>();
         try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            try (
                    ResultSet rst = pstmt.executeQuery()) {
                while (rst.next()) {
                    Student student = new Student(rst.getString("student_id"), rst.getString("password"),rst.getString("role"),
                            rst.getString("password"), rst.getString("birthday"),
                            rst.getString("gender"), rst.getString("email"),
                            rst.getString("phone"), rst.getString("address"),
                            rst.getString("major"),rst.getString("department"));
                    students.add(student);
                }
                    }
                }

        return students;
    }

    @Override
    public boolean deleteStudent(String studentId) throws  SQLException{
        String sql = "DELETE FROM students WHERE student_id=?";
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, studentId);
            pstmt.executeUpdate();
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        }
        return true;
    }

    public  boolean modifyStudent (Student student) throws SQLException {
        String sql = "UPDATE  students SET stud_id=?, password=?,name=?,birthday=?,gender=?,email=?,phone=?,address=?,department=? WHERE stud_id=?";
         try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, student.getId());
                pstmt.setString(2, student.getPwd());
                pstmt.setString(3, student.getName());
                pstmt.setString(4, student.getBirthday());
                pstmt.setString(5, student.getGender());
                pstmt.setString(6, student.getEmail());
                pstmt.setString(7, student.getPhone());
                pstmt.setString(8, student.getAddress());
                pstmt.setString(9, student.getDepartment());
                 pstmt.setString(10, student.getId());
                }
         catch ( SQLException sqlException)
             {
                return false;
             }
         return true;

    }
}
