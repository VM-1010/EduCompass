package com.educompass.dao;
import java.util.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.*;

import com.educompass.exception.IDMismatchException;
import com.educompass.exception.InvalidAccessException;
import com.educompass.exception.InvalidResourceException;
import com.educompass.model.*;

public class ResourceDAO {
    Connection c;
    Statement s;
    String schema;  
    String init; // holds the inital rows
    public ResourceDAO() throws SQLException{
        c = DriverManager.getConnection("jdbc:sqlite:resource.db");
        s = c.createStatement();
        try {
            schema = new String(getClass().getResourceAsStream("/database/schema.sql").readAllBytes(), StandardCharsets.UTF_8);
            init = new String(getClass().getResourceAsStream("/database/init.sql").readAllBytes(), StandardCharsets.UTF_8);
            s.execute(schema);
            s.executeUpdate(init);
        } catch (Exception e) {
            IO.println("Cannot fetch resource : " + e.getMessage());
        }

        // DATABASE OK!!!
    }

    public List<Resource> getAll() throws SQLException{
        List<Resource> ls = new ArrayList<>();
        ResultSet rs = s.executeQuery("select * from resources");
        int count = 0;
        while (rs.next()) {
            count ++;
            String resource_type = rs.getString("resource_type");
            Resource toAdd = null;
            // IO.println(resource_type);
            switch(resource_type) {
                case "book" -> {
                    // IO.print("added ebook");
                    toAdd = new BookResource(rs.getInt("id"), rs.getString("resource_title"), rs.getInt("semester"), rs.getString("course"),new ResLink( rs.getString("resource_link")),rs.getFloat("book_price"));
                }
                /* 
                case "physicalbook" -> {
                    // IO.print("added physicalbook");
                    toAdd = new BookResource(rs.getInt("id"), rs.getString("resource_title"), rs.getInt("semester"), rs.getString("course"),new ResLink( rs.getString("resource_link")),rs.getFloat("book_price"));
                }
                    */
                case "pdf" -> {
                    toAdd = new PdfResource(rs.getInt("id"), rs.getString("resource_title"), rs.getInt("semester"), rs.getString("course"),new ResLink( rs.getString("resource_link")),rs.getInt("pdf_pages"));
                }
                default -> {
                    IO.println("Access for type '"+ resource_type + "' is not implemented!");
                }
            }
            ls.add(toAdd);
        }
        IO.println("Inserted "+ count + " items");
        return ls;
    }


    // INFO Service implements different cases of resources to add

    // TODO might need overloading
    public void addResource(String resource_title, String resource_source, int semester, String course, String resource_type, String resource_link, int pdf_pages, double video_hrs, int vidcount, double course_price, double book_price, int nptel_year) throws InvalidResourceException {
        // TODO
    }

    public void getColOfRowId(int id, String col) {

    }

    public List<Resource> getEvery(ResType type) throws SQLException {
        List<Resource> result = new ArrayList<>();
        ResultSet rs = s.executeQuery("select * from resources where type='"+type);

        // TODO to implement
        return result;
    }

    public Resource getRow(int id)  {
        Resource r = null;
        // TODO add impl if needed
        return r;
    }

    // TODO also may need to overload
    public void setRow(int id, String resource_title, String resource_source, int semester, String course, String resource_type, String resource_link, int pdf_pages, double video_hrs, int vidcount, double course_price, double book_price, int nptel_year) {


    }

    public void deleteResourceById(int id) throws IDMismatchException {

    }

}