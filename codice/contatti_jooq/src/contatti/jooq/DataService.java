package contatti.jooq;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import contatti.db_sqlite.CreateDB;
import unibg.ingsw.tables.Indirizzi;
import unibg.ingsw.tables.records.IndirizziRecord;

public class DataService {

	public static List<IndirizziRecord> getIndirizziRecord() {
		Connection conn;
		try {
			conn = DriverManager.getConnection(CreateDB.DB_URL);
			DSLContext create = DSL.using(conn, SQLDialect.SQLITE);	
			return create.selectFrom(Indirizzi.INDIRIZZI).fetchInto(IndirizziRecord.class);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;		
	}
}
