package com.api.tests;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String dbURL = "https://orgname.com";
		String dbUser = "sampleuser";
		String password = "samplepassword";

		String query = "delete from patients where first_name='Jon'";
		String result = "";

		// connecting to db
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con = DriverManager.getConnection(dbURL, dbUser, password);
		java.sql.Statement stmnt = con.createStatement();
		ResultSet rs = stmnt.executeQuery(query);
		while (rs.next()) {
			 result = rs.getString(1);			 
		}
		rs.close();
		con.close();

	}

}
