package connection;
import java.sql.*;

public class Getjdbc {
	public static void insert()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/balajdbcsql";
		String username="root";
		String password="9585";
		String Query="select *from office";
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println("id: "+rs.getInt(1));
			System.out.println("name: "+rs.getString(2));
			System.out.println("age: "+rs.getInt(3));
			System.out.println(" ");
		}
		

		con.close();
	}
	public static void main(String[]args)throws Exception {
		insert();
	}
	}


