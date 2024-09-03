package sri;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionToJDBC {
	public static void main(String []args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampletable","root","1234");
	Statement createStatement = connection.createStatement();
	ResultSet executeQuery = createStatement.executeQuery("select * from employees");
	while (executeQuery.next()) {
		System.out.println(executeQuery.getInt(1));
	}
	
	}
}
