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

@WebServlet("/modify_student")

public class ModifyStudentInfoServlet extends HttpServlet {

    private StudentDao studentDao = new StudentDaoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String studentId = request.getParameter("studentId");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String department = request.getParameter("department");

        Student student = new Student();
        student.setId(studentId);
        student.setName(name);
        student.setPwd(password);
        student.setBirthday("null"); // 示例日期
        student.setGender(gender);
        student.setEmail(email);
        student.setPhone(phone);
        student.setAddress(address);
        student.setDepartment(department);
        String message;
        try {
            boolean success =  studentDao.modifyStudent(student);
            if (success) {
                message = "修改学生成功！";
            } else {
                message = "修改学生失败，请检查输入信息。";
            }
        } catch (Exception e) {
            message = "系统错误，修改失败：" + e.getMessage();
        }
        // 将提示信息放入 request 作用域
        request.setAttribute("message", message);

        // 转发回原页面
        request.getRequestDispatcher("modify_student.jsp").forward(request, response);
    }

}
