package com.qa.Common;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
}
