package connection;
import java.sql.*;

public class Deletejdbc {
	public static void insert()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/balajdbcsql";
		String username="root";
		String password="9585";
		String Query="delete from office where id=1014";
		
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
	
		
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args)throws Exception {
		insert();
	}
	}


