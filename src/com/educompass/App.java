package com.educompass;

import com.educompass.service.ResourceService;

// TODO need to add logging
// TODO need to add services
// TODO need to add custom exceptions

public class App {
    public static void main(String[] args) throws Exception {
        ResourceService rs = new ResourceService();
        IO.println(rs);
    }
}
