package com.qa.Common;

import io.appium.java_client.MobileElement;

import java.sql.*;

public class FetchTestData implements MobilenoAndPassword{

    public String mobile;
    public String password1;

    DataBaseConnection dataBaseConnection = new DataBaseConnection();
    Statement st = dataBaseConnection.get_Connection().createStatement();
    ResultSet rs;

    public String getMobileNO() {
        return mobile;
    }

    public String getPassword() {
        return password1;
    }

    public FetchTestData() throws SQLException {
    }
    public void findUser(int userid) throws SQLException {
        String query = "select * from tbl_users where userid = " + userid;
        rs = st.executeQuery(query);
        while (rs.next()) {
            try {
                mobile = rs.getString("mobile");
                password1 = rs.getString("password");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   /*
    UserData userData ;
     public void insertUser(MobileElement name, MobileElement emailId, MobileElement phone_No, MobileElement password, MobileElement city, MobileElement pinCode, MobileElement licenseNo) throws SQLException {
        String sql = "insert into tbl_users(name, emailId, phone_no, password, city, pinCode, licenceNo, userType) values(?,?,?,?,?,?,?,'user')";
         PreparedStatement ps = dataBaseConnection.get_Connection().prepareStatement(sql);

         name = userData.getName();
         emailId = userData.getEmailId();
         phone_No = userData.getPhone_No();
         password = userData.getPassword();
         city = userData.getCity();
         pinCode = userData.getPinCode();
         licenseNo  = userData.getLicenceNo();

         ps.setString(1, String.valueOf(name));
         ps.setString(2, String.valueOf(emailId));
         ps.setString(3, String.valueOf(phone_No));
         ps.setString(4, String.valueOf(password));
         ps.setString(5, String.valueOf(city));
         ps.setString(6, String.valueOf(pinCode));
         ps.setString(7, String.valueOf(licenseNo));
         //ps.setString(8, 'user');

        ps.executeUpdate(sql);

    }*/
}
