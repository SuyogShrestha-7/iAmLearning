import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector{
    private static final String Url="jdbc:mysql://localhost:3306/iAmlearing";
    private static final String user="root";
    private static final String password="SuyogShrestha";

    public static Connection getconnection() throws SQLException, ClassNotFoundException {
        return DriverManager.getConnection(Url,user,password);
    }
}