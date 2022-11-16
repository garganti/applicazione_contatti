package contatti.jooq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.meta.mysql.MySQLDatabase;

import contatti.db_sqlite.CreateDB;
import unibg.ingsw.tables.Indirizzi;
import unibg.ingsw.tables.records.IndirizziRecord;

public class QueryDB {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection(CreateDB.DB_URL);
		DSLContext create = DSL.using(conn, SQLDialect.SQLITE);	
		Result<IndirizziRecord> indirizzi = create.selectFrom(Indirizzi.INDIRIZZI).fetch();
		System.out.println(indirizzi);
	}

}
