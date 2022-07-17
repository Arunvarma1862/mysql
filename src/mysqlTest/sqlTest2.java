package mysqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlTest2 {

	public static void main(String[] args) throws Exception {


		// 1. create connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Arunroot@123");

		// 2.create ststement/query         and 

		  Statement  stmt = con.createStatement();

		//	String s="insert into student values(106,'smithbabu',85)";
		//	String s="update student set name ='david' where sid=106";
		//	String s="delete from student where sid=103";


		   String s=" select code,population,region,gnp from country";


		//	3,4. excute the query      and       store data in result set

		ResultSet rs=	stmt.executeQuery(s);
		while(rs.next())
		{
			String c =	rs.getString("code");
			int pop  = rs.getInt("population");
			String r =	rs.getString("region");
			int gnp  = rs.getInt("gnp");
			System.out.println(c+"  "+pop+"   "+r+"    "+gnp);
		}



		// 5.close connection

		con.close();
		System.out.println("query excuted........... ");

	}

}
