package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserService {
    public void getUserData(String inputUserId) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        Statement stmt = conn.createStatement();

        // VULNERABLE: Direct string concatenation of untrusted user input into a SQL query
        String query = "SELECT * FROM users WHERE id = '" + inputUserId + "'";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
    }
}

