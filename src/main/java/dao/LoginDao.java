package dao;

import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface LoginDao extends Dao{

    public boolean validateUser(String studentId, String password)throws SQLException;

    public void logLoginInfo(String studentId, String ipAddress, String loginTime, String status)throws SQLException;
}
