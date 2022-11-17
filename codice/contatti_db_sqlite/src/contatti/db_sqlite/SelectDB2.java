package contatti.db_sqlite;
import java.io.File;
import java.io.IOException;
import java.sql.*;

public class SelectDB2 {

	public static void main(String args[]) throws IOException {
		File currentPath = new File("db/indirizzi.db3");

		String canonicalPath = currentPath.getCanonicalPath();
		System.out.println(canonicalPath);
		String url = "jdbc:sqlite:" + canonicalPath;

		try (Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				Statement stmt = conn.createStatement();
				String sql = "SELECT * FROM INDIRIZZI";
				int res = stmt.executeUpdate(sql);
				stmt.close();
				conn.close();
				System.out.println("Table created successfully");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}