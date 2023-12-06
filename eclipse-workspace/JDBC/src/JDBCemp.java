import java.sql.*;
public class JDBCemp {

	public static void main(String[] args) throws Exception {
		readRecords();
		
	}
	public static void readRecords() throws Exception
	{
		String url ="jdbc:mysql://localhost:3306/Hari";
		String userName = "root";
		String passWord = "24&Hari@2003";
		String query = "Select * from EMP";
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("ID is   = " + rs.getInt(1));
			System.out.println("NAME is = " + rs.getString(2));
			System.out.println("Salary  = " + rs.getInt(3));
		}
    con.close();
	}
    
}
