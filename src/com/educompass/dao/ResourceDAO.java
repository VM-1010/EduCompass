package com.educompass.dao;
import java.util.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.*;

import com.educompass.exception.IDMismatchException;
import com.educompass.exception.InvalidResourceException;
import com.educompass.model.*;

public class ResourceDAO {
    Connection c;
    Statement s;
    String schema;  
    String init; // holds the inital records
    public ResourceDAO() throws SQLException{
        c = DriverManager.getConnection("jdbc:sqlite:resource.db");
        s = c.createStatement();
        // TODO  remove try
        try {
            schema = new String(getClass().getResourceAsStream("/database/schema.sql").readAllBytes(), StandardCharsets.UTF_8);
            init = new String(getClass().getResourceAsStream("/database/init.sql").readAllBytes(), StandardCharsets.UTF_8);
            s.execute(schema);
            s.executeUpdate(init);
        } catch (Exception e) {
            IO.println("Cannot fetch resource : " + e.getMessage());
        }
    }

    public List<Resource> getAllResources() throws SQLException{
        List<Resource> ls = new ArrayList<>();
        ResultSet rs = s.executeQuery("select * from resources");
        while (rs.next()) {
            String resource_type = rs.getString("resource_type");
            Resource toAdd = null;
            switch(resource_type) {
                case "ebook" -> {
                    // IO.print("added ebook");
                    toAdd = new BookResource(rs.getInt("id"), rs.getString("resource_title"), rs.getInt("semester"), rs.getString("course"),new ResLink( rs.getString("resource_link")),rs.getFloat("book_price"));
                }
                case "physicalbook" -> {
                    // IO.print("added physicalbook");
                    toAdd = new BookResource(rs.getInt("id"), rs.getString("resource_title"), rs.getInt("semester"), rs.getString("course"),new ResLink( rs.getString("resource_link")),rs.getFloat("book_price"));
                }
                case "pdf" -> {
                    toAdd = new PdfResource(rs.getInt("id"), rs.getString("resource_title"), rs.getInt("semester"), rs.getString("course"),new ResLink( rs.getString("resource_link")),rs.getInt("pdf_pages"));
                }
                default -> {
                    IO.println("Something is wrong");
                }
            }
            ls.add(toAdd);
        }
        return ls;
    }


    // INFO Service implements different cases of resources to add

    // TODO might need overloading for each restype
    public void addResource(String resource_title, String resource_source, int semester, String course, String resource_type, String resource_link, int pdf_pages, double video_hrs, int vidcount, double course_price, double book_price, int nptel_year) throws InvalidResourceException {
        // TODO
    }

    public void getColOfRowId(int id, String col) {

    }

    // TODO also need to overload
    public void setResource(int id, String resource_title, String resource_source, int semester, String course, String resource_type, String resource_link, int pdf_pages, double video_hrs, int vidcount, double course_price, double book_price, int nptel_year) {


    }

    public void deleteResourceById(int id) throws IDMismatchException {

    }

// TODO this should be moved to a service
    public void printAllTitles() {
        try {
            int count = 0;
            for (Resource r : getAllResources()) {
                IO.println(++count + " " + r);
            }
        } catch (SQLException e) {
            IO.println("Cannot fetch resources" + e.getMessage());
        }
    }


// TODO this should be moved to a service
    public void printAllBooksWithPriceLessThan(int n) {
        try {
            int count = 0;
            for (Resource r : getAllResources()) {
                if (r instanceof BookResource && ((BookResource)r).getBook_price()<n)
                IO.println(++count + " " + r + " " + ((BookResource)r).getBook_price());
            }
        } catch (SQLException e) {
            IO.println("Cannot fetch resources" + e.getMessage());
        }
    }

}