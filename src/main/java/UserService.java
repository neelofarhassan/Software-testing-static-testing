
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserService {
    public static void main(String[] args) {

        String name = null;

        // Potential NullPointerException
        System.out.println(name.toUpperCase());
    }
}

