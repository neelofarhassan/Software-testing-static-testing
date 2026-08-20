
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserService {

    public static void main(String[] args) throws Exception {

        // External, potentially attacker-controlled input
        String script = System.getenv("SCRIPTNAME");

        if (script != null) {

            // VULNERABLE:
            // User-controlled value passed directly to Runtime.exec()
            Runtime.getRuntime().exec(script);
        }
    }
}

