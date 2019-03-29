package jdbcPreparedStatement;
import java.sql.*;



public class samplePreparedStatement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/test1";
		String user = "srikanth";
		String password = "srikanth";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, password);
		String query = "UPDATE team set tname = ? WHERE tid = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "social");
		ps.setInt(2, 202);
		//ps.setString(3, "rajesh");
		int count = ps.executeUpdate();
		
		System.out.println(count+" rows are affected ");

	}

}
