package org.souvik.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","admin13");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
