package dao;

import java.sql.*;
import model.*;
import java.util.*;

public class MainDao {
    private static Connection c;

    public MainDao(){
        try {
            c = DriverManager.getConnection("jdbc:sqlite:res.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public List<Resource> fetchAll() {
        List<Resource> l = new ArrayList<>();
        try {
            PreparedStatement ps = c.prepareStatement("select * from resources");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                l.add(
                    new Resource(
                        rs.getInt("id"),
                        rs.getInt("semester"), 
                        rs.getString("title"), 
                        rs.getString("type"), 
                        rs.getString("url")
                    )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return l;
    }
}
