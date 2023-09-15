package com.divya.design.pattern.singleton;

public class Main {
    public static void main(String[] args) {
        String url="http:localhost:8080";
        String user="root";
        String password="abc@123";
        DBConnection con = DBConnection.getInstance(url, password,user);
        con.executeQuery();
    }
}
