package contatti.jooq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.meta.mysql.MySQLDatabase;

import contatti.db_sqlite.CreateDB;
import unibg.ingsw.tables.Indirizzi;
import unibg.ingsw.tables.records.IndirizziRecord;

public class InsertInDB {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection(CreateDB.DB_URL);
		DSLContext create = DSL.using(conn, SQLDialect.SQLITE);			
		
		IndirizziRecord giovanni = new IndirizziRecord("giobbvanni", "0355667700");
		
		int result = create.insertInto(Indirizzi.INDIRIZZI).set(giovanni).execute();
		
		System.out.println(result);
	}

}
