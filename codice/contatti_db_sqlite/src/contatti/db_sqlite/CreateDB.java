package contatti.db_sqlite;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {

	public static String DB_URL = "";
	
	static {
		// codice per stampare il path e settarlo in modo corretto
		File currentPath = new File("../contatti_db_sqlite/db/indirizzi.db3");
		assert currentPath.exists();
		try {
			System.out.println(currentPath.getCanonicalPath());
			DB_URL = "jdbc:sqlite:"+ currentPath.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	

	public static void main(String[] args) throws IOException {
			try (Connection conn = DriverManager.getConnection(DB_URL)) {
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database has been created.");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
