package connection;
import java.sql.*;
public class Insertjdbc {
public static void insert()throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/balajdbcsql";
	String username="root";
	String password="9585";
	String Query="insert into office values(?,?,?)";
	
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setInt(1, 1014);
	pst.setString(2, "arun");
	pst.setInt(3, 20);
	
	
	pst.executeUpdate();
	con.close();
}
public static void main(String[]args)throws Exception {
	insert();
}
}
