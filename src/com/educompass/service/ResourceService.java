package com.educompass.service;

import java.sql.SQLException;
import java.util.*;
import com.educompass.model.*;
import com.educompass.dao.ResourceDAO;
import com.educompass.exception.DBServiceException;
import com.educompass.exception.InvalidAccessException;


public class ResourceService {
    ResourceDAO database;
    public ResourceService()  {
        try {    
            database = new ResourceDAO();
        } catch (SQLException e) {
            throw new DBServiceException();
        } catch (Exception e) {
            throw new RuntimeException("There was an unknown issue while setting up the database.");
        }
    }

    public List<Resource> fetchAllResources() {
        List<Resource> result;
        try {
            result = database.getAll();
        } catch (Exception e) {
            result = new ArrayList<>();
            throw new DBServiceException();
        }
        return result;
    }

    public List<Resource> fetchAllPdfs() {
        List<Resource> result;
        try{
            result = database.getEvery(ResType.PDF);
        } catch (Exception e) {
            result = new ArrayList<>();
            throw new DBServiceException();
        }
        return result;
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------\n");
        for (Resource r : fetchAllResources()) {
            sb.append(r);
        }
        sb.append("----------------------------\n");
        return sb.toString();
    }

}
