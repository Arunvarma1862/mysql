package mysqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlTest {

	public static void main(String[] args) throws Exception {


		// 1. create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhr","root","Arunroot@123");

		// 2.create statement/query 

		Statement  stmt = con.createStatement();

		//	String s="insert into student values(106,'smithbabu',85)";
		//	String s="update student set name ='david' where sid=106";
		    String s="delete from student where sid=103";

		//	3.excute the query

		stmt.execute(s);

		// 4.close connection

		con.close();
		System.out.println("query excuted ");

	}

}
