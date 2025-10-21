package dao;

import java.sql.*;


public class MainDao {
    private static Connection c;

    public MainDao(){
        try {
            c = DriverManager.getConnection("jdbc:sqlite:res.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
