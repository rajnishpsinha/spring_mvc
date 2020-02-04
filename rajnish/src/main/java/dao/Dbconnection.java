package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Dbconnection {
static Connection connection= null;
static {
	try{
		Context context=new InitialContext();
		DataSource ds= (DataSource) context.lookup("java:comp/env/jdbc/UsersDB");
		connection = ds.getConnection();	
	}
	catch(NamingException e)
	{
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
public static Connection getConnection()
 {return connection;}
}
