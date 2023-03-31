package exercise_2;
import main.MyConnection;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

public class Exercise_2 {
	static Statement stmt;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MyConnection.connect();
		stmt = con.createStatement();
		stmt.executeUpdate("create table employee(empno integer,ename varchar(20),deptno integer)");

	}

}
