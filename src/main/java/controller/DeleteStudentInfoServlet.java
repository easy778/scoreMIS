package controller;

import dao.StudentDao;
import dao.StudentDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/delete_student")
public class DeleteStudentInfoServlet extends HttpServlet {
    private StudentDao studentDao = new StudentDaoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String studentId = request.getParameter("studentId");

        String message;
        try {

            boolean success =  studentDao.deleteStudent(studentId);
            if (success) {
                message = "删除学生成功！";
            } else {
                message = "删除学生失败，请检查输入信息。";
            }
        } catch (Exception e) {
            message = "系统错误，删除失败：" + e.getMessage();
        }
        // 将提示信息放入 request 作用域
        request.setAttribute("message", message);

        // 转发回原页面
        request.getRequestDispatcher("/delete_student.jsp").forward(request, response);
    }
}