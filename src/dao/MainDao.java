package dao;

import java.sql.*;
import java.util.*;
import model.*;

public class MainDao {
    private static Connection c;

    public MainDao() {
        try {
            c = DriverManager.getConnection("jdbc:sqlite:res.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Resource> fetchAll() {
        List<Resource> l = new ArrayList<>();
        try (PreparedStatement ps = c.prepareStatement("SELECT * FROM resources");
            ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                l.add(new Resource(
                        rs.getInt("id"),
                        rs.getInt("semester"),
                        rs.getString("title"),
                        rs.getString("type"),
                        rs.getString("url")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }

    public Resource fetchById(int id) {
        try (PreparedStatement ps = c.prepareStatement("SELECT * FROM resources WHERE id = ?")) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Resource(
                            rs.getInt("id"),
                            rs.getInt("semester"),
                            rs.getString("title"),
                            rs.getString("type"),
                            rs.getString("url")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insert(Resource r) {
        String sql = "INSERT INTO resources(title, semester, type, url) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, r.getTitle());
            ps.setInt(2, r.getSemester());
            ps.setString(3, r.getType());
            ps.setString(4, r.getUrl());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Resource r) {
        String sql = "UPDATE resources SET title = ?, semester = ?, type = ?, url = ? WHERE id = ?";
        try (PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, r.getTitle());
            ps.setInt(2, r.getSemester());
            ps.setString(3, r.getType());
            ps.setString(4, r.getUrl());
            ps.setInt(5, r.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM resources WHERE id = ?";
        try (PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
