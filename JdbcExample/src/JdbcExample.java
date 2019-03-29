import java.sql.*;
public class JdbcExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/test1";
		String user = "srikanth";
		String password = "srikanth";
		Connection con = DriverManager.getConnection(url, user, password);
		
		Statement st = con.createStatement();
		
		String Query = "select *from employee";
		ResultSet rs = st.executeQuery(Query);
		
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}

}
