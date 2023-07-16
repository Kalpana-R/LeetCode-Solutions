package newlife;
import java.sql.*;

public class CommitAutoCommit {

	public static void main(String[] args)throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "puppy";
				
		Connection con = DriverManager.getConnection(url,username, password);
		con.setAutoCommit(false); 
		
		String query1 = "update employee set salary = 50000 where empid=17";
		String query2 ="update employee set salary= 55000 where empid= 18";
		
		Statement st = con.createStatement();
		int rows1 = st.executeUpdate(query1);
		System.out.println("Rows1:"+rows1);
		
		int rows2=st.executeUpdate(query2);
		System.out.println("rows2:"+rows2);
		
		if(rows1>0 &&rows2>0)
		{
			System.out.println("Commited");
			con.commit();
		}
		
		
		con.close();
		
	}
	
}
