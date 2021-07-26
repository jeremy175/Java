package datos;

import java.sql.*;

public class Conexion {
    private static final String jdbc_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String jdbc_User = "root";
    private static final String jdbc_Password="admin";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(jdbc_URL, jdbc_User, jdbc_Password);
    }
    
    public static void Close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void Close(Statement smtm) throws SQLException{
        smtm.close();
    }
     public static void Close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
     
    public static void Close(Connection conn) throws SQLException{
        conn.close();
    }
}
