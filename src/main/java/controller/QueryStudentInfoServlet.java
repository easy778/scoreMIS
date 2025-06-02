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
import java.util.ArrayList;
import java.util.List;

@WebServlet("/query_student")

public class QueryStudentInfoServlet extends HttpServlet {
    private StudentDao studentDao= new StudentDaoImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String queryType = request.getParameter("queryType");
        List<Student> students = new ArrayList<>();

        if ("all".equals(queryType)) {
            // 全部查询
            try {
                students = studentDao.findAllStudent();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else if ("byId".equals(queryType)) {
            String studentId = request.getParameter("studentId");
            if (studentId != null && !studentId.trim().isEmpty()) {
                Student student = null;
                try {
                    student = studentDao.findStudentById(studentId);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                if (student != null) {
                    students.add(student);
                }
            }
        }
        request.setAttribute("students", students);
        request.getRequestDispatcher("showStudentInfo.jsp").forward(request, response);
    }

}