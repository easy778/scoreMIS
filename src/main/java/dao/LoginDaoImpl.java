package dao;

import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
    //验证用户的账号密码是否正确
    public boolean validateUser(String id, String pwd) {
        String sql = "SELECT pwd FROM Account WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("pwd").equals(pwd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void logLoginInfo(String id, String ipAddress, String operate_time, String status) throws SQLException {
        String sql = "INSERT INTO audit_log  VALUES(?,?,?,?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            pstmt.setString(2, ipAddress);
            pstmt.setString(3, status);
            pstmt.setString(4, operate_time);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
