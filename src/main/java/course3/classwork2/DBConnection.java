package course3.classwork2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public class DBConnection {

    private static DBConnection instance;
    private Connection connection;

    private DBConnection() throws SQLException {
        ResourceBundle rb = ResourceBundle.getBundle("db");
        String host = rb.getString("host");
        String port = rb.getString("port");
        String db = rb.getString("db");
        String user = rb.getString("user");
        String password = rb.getString("password");

        String jdbcURL = MessageFormat.format("jdbc:mysql://{0}:{1}/{2}", host, port, db);
        connection = DriverManager.getConnection(jdbcURL, user, password);
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            try {
                instance = new DBConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
