package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserService {
    public static void main(String[] args) throws Exception {

        // Externally controlled input
        String command = System.getenv("USER_COMMAND");

        if (command != null) {
            // VULNERABLE: untrusted input is executed as an OS command
            Runtime.getRuntime().exec(command);
        }
    }
}

