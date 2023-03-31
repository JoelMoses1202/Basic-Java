package exercise_3;
import main.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise_3 {
	static Statement stmt;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MyConnection.connect();
		 stmt = con.createStatement();
		 stmt.executeUpdate(" insert into employee values (001,'sakre',23)");
		 stmt.executeUpdate(" insert into employee values (001,'pradeep',223)");
	     stmt.executeUpdate(" insert into employee values (001,'vivek',243)");

	}

}
