
import java.sql.*;

public class OracleInset {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##green";
		String password = "green1234";

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connencion success.\n");

			Statement stmt = conn.createStatement();

			String ideptno = "50", sdname = "IT", sloc = "SEOUL";
			String sql = "INSERT INTO dept VALUES ('" + ideptno + "','" + sdname + "','" + sloc + "')";

			boolean b = stmt.execute(sql);

			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}
			
			// SELECT QUERY
			String sql1 = "SELECT MAX(deptno) FROM dept";
			ResultSet rs = stmt.executeQuery(sql1);
			System.out.println(res);

			int deptno = Integer.parseInt(res);

			// INSERT QUERY
			String indeptno = String.valueOf(deptno+1),sdname="IT", sloc="SE"
			
			
			// SELECT QUERY
			String sql2 = "SELECT deptno, dname, loc FROM dept";
			ResultSet rs = stmt.executeQuery(sql2);
			while (rs.next()) {
				System.out.print(rs.getString("deptno") + "\t"); // ег
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("loc") + " ");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}