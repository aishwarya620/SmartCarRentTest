package com.qa.Pages;

import io.appium.java_client.AppiumDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasePage {
    protected static AppiumDriver driver;
    public final String appPackage = "com.example.cc14.smartcarrent";

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }
   /*
    public static Connection get_Connection() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/smartcarrent";
        String userName = "root";
        String password = "aishu65203";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement st = connection.createStatement();
            String query = "select * from tbl_users";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                String name = rs.getString("email");
                System.out.println("name"+name);
            }
            return connection;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }*/
}
