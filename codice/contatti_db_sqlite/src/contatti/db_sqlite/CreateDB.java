package contatti.db_sqlite;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {

	public static final String DB_URL = "jdbc:sqlite:D:\\AgHome\\workspaces\\didattica\\ingdelsw\\contatti.db_sqlite\\db\\indirizzi.db3";
	
	static {
		// codice per stampare il path
		File currentPath = new File("db/indirizzi.db3");
		try {
			System.out.println(currentPath.getCanonicalPath());
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
