package com.qa.Common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {

    public static final String BASE_URL = "http://127.0.0.1/SmartCarRentWeb/";




    public Connection get_Connection() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/smartcarrent";
        String userName = "root";
        String password = "aishu65203";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, userName, password);
            return connection;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
