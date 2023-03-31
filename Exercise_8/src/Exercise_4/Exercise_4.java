package Exercise_4;

import main.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise_4 {



	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		Connection con = MyConnection.connect();
		Statement stmt;
		PreparedStatement updateSales;
		PreparedStatement updateTotal;
		String updateString = "update COFFEES " + "set SALES = ? where COF_NAME like ?";
		String updateStatement = "update COFFEES " + "set TOTAL = TOTAL + ? where COF_NAME like ?";
		String query = "select COF_NAME, SALES, TOTAL from COFFEES";
		System.out.println("Enter Coffee Name");
		String coffeName=scanner.next();
		int price=scanner.nextInt();
		Coffee coffee=new Coffee();
		coffee.setCoffee(coffeName);
		coffee.setPrice(price);

		try {

			updateSales = con.prepareStatement(updateString);
			updateTotal = con.prepareStatement(updateStatement);
			con.setAutoCommit(false);
				updateSales.setInt(1,coffee.getPrice());
			    System.out.println(coffee.getPrice());
				updateSales.setString(2,coffee.getCoffee()+"");
				updateSales.executeUpdate();
				updateTotal.setInt(1, coffee.getPrice());
				updateTotal.setString(2, coffee.getCoffee()+"");
				updateTotal.executeUpdate();
				con.commit();
//			con.setAutoCommit(false);
			updateSales.close();
			updateTotal.close();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String c = rs.getString("COF_NAME");
				int s = rs.getInt("SALES");
				int t = rs.getInt("TOTAL");
				System.out.println(c + "     " + s + "    " + t);
			}
			stmt.close();
			con.close();
		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
			if (con != null) {
				try {
					System.err.print("Transaction is being ");
					System.err.println("rolled back");
					con.rollback();
				} catch (SQLException excep) {
					System.err.print("SQLException: ");
					System.err.println(excep.getMessage());
				}
			}
		}
	}

}
