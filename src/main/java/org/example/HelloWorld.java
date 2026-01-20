package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloWorld {
    public void convert(String[] args) {
        try {

            String json = new ObjectMapper().writeValueAsString(args);
            System.out.println(json);
        } catch (Exception e) {
            System.out.printf(e.toString());
        }
    }
}
