package controller;

import dao.LoginDao;
import dao.LoginDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.DBUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取用户输入的ID和密码
        String ID = request.getParameter("id");
        String password = request.getParameter("password");

        // 获取用户IP地址
        String ipAddress = request.getRemoteAddr();
        if (ipAddress.equals("0:0:0:0:0:0:0:1")) {
            ipAddress = java.net.InetAddress.getLocalHost().getHostAddress();
        }

        // 获取当前时间
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String loginTime = dateFormat.format(new Date());

        // 验证用户信息
        LoginDao loginDao=new LoginDaoImpl();
        boolean isLoginSuccessful = false;
        try {
            isLoginSuccessful = loginDao.validateUser(ID, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (isLoginSuccessful) {
            // 记录登录信息
            try {
                loginDao.logLoginInfo(ID, ipAddress, loginTime, "登录");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            response.sendRedirect("myInfo.jsp"); // 跳转到个人信息页面
        } else {
            // 记录登录失败信息
            try {
                loginDao.logLoginInfo(ID, ipAddress, loginTime, "登录失败");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            response.sendRedirect("index.jsp?error=true"); // 跳转回登录页面
        }
    }

}