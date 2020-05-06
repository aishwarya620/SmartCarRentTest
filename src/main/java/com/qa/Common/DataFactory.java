package com.qa.Common;

import java.sql.*;

public class DataFactory implements MobilenoAndPassword{

    public String mobile;
    public String password1;

    public Connection get_Connection(int userid) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/smartcarrent";
        String userName = "root";
        String password = "aishu65203";
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement st = connection.createStatement();
            String query = "select * from tbl_users where userid = " + userid;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                mobile = rs.getString("mobile");
                password1 = rs.getString("password");
            }
            return connection;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public String getMobileNO() {
        return mobile;
    }
    public String getPassword() {
        return password1;
    }
}
