package contatti.jooq;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.Configuration;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.Target;

import contatti.db_sqlite.CreateDB;

// codice per generare i sorgenti a partire dal DB
public class GenerateCode {

	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration()
				.withJdbc(new Jdbc().withDriver("org.sqlite.JDBC")
				.withUrl(CreateDB.DB_URL))
				.withGenerator(new Generator()
				.withDatabase(new Database().withName("org.jooq.meta.sqlite.SQLiteDatabase").withIncludes(".*")
				.withExcludes(""))
				.withTarget(new Target().withPackageName("contatti.jooq.generated")
				.withDirectory("src-generated/")));
		GenerationTool.generate(configuration);
	}

}
