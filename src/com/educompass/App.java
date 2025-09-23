package com.educompass;

import com.educompass.dao.ResourceDAO;

// TODO need to add logging
// TODO need to add services
// TODO need to add custom exceptions

public class App {
    public static void main(String[] args) throws Exception {
        ResourceDAO rd = new ResourceDAO();
        IO.println("Fetching all resource titles");
        rd.printAllTitles();

        IO.println("Printing all resources with price less than 700");
        rd.printAllBooksWithPriceLessThan(700);
    }
}
