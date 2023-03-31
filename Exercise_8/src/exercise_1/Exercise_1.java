package exercise_1;
import main.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise_1 {

	static Statement stmt;
	static ResultSet rs;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con=MyConnection.connect();
		stmt = con.createStatement();
		rs = stmt.executeQuery("Select * from emp");
		while (rs.next())
			System.out.println(rs.getString(1) + " " + rs.getInt(2));
	}

}
