package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public interface Dao {
    
    private DataSource getDataSource() {

        DataSource dataSource = null;
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/student");
        } catch (NamingException ne) {
            System.out.println("异常:" + ne);
        }
        return dataSource;
    }

    public default Connection getConnection() throws SQLException {
        DataSource dataSource = getDataSource();
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException sqle) {
            System.out.println("异常:" + sqle);
        }
        return conn;
    }

//    public default Connection getConnection() throws SQLException {
//        String driver = "com.mysql.cj.jdbc.Driver";
//        try{
//            Class.forName(driver); // 加载驱动程序
//        }catch(ClassNotFoundException e){
//            System.out.println("驱动程序类找不到！");
//        }
//        String username = "root";
//        String password = "123456";
//        String dburl = "jdbc:mysql://127.0.0.1:3306/webstore?useSSL=false&serverTimezone=UTC";
//        Connection conn = null ;
//        try {
//            conn = DriverManager.getConnection(dburl,username,password);
//        }catch(SQLException e){
//            throw e;
//        }catch(Exception e){
//            throw new RuntimeException(e);
//        }
//        return conn;
//    }
}
