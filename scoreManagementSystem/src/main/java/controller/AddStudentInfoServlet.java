package controller;

import dao.StudentDao;
import dao.StudentDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Student;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/add_student")
public class AddStudentInfoServlet extends HttpServlet {
    private StudentDao studentDao = new StudentDaoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String studentId = request.getParameter("studentId");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String birthdayStr = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String department = request.getParameter("department");

        Student student = new Student();
        student.setId(studentId);
        student.setPwd("64,mr59");
        student.setName(name);
        student.setEmail("3366@qq.com");
        student.setBirthday(birthdayStr);
        student.setGender(gender);
        student.setPhone(phone);
        student.setAddress(address);
        student.setDepartment(department);
        student.setRole("student");

        String message;
        try {

            boolean success =  studentDao.addStudent(student);
            if (success) {
                message = "添加学生成功！";
            } else {
                message = "添加学生失败，请检查输入信息。";
            }
        } catch (Exception e) {
            message = "系统错误，添加失败：" + e.getMessage();
        }
        // 将提示信息放入 request 作用域
        request.setAttribute("message", message);

        // 转发回原页面
        request.getRequestDispatcher("add_student.jsp").forward(request, response);

    }
}