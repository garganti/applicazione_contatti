package contatti.jooq;

import org.jooq.codegen.GenerationTool;
import org.jooq.codegen.JavaGenerator;
import org.jooq.meta.jaxb.Configuration;
import org.jooq.meta.jaxb.Database;
import org.jooq.meta.jaxb.Generator;
import org.jooq.meta.jaxb.Jdbc;
import org.jooq.meta.jaxb.Target;

import contatti.db_sqlite.CreateDB;

// codice per generare i sorgenti a partire dal DB
public class GenerateCode {

	public static void main(String[] args) throws Exception {
		
		Jdbc JDBC = new Jdbc().withDriver("org.sqlite.JDBC").withUrl(CreateDB.DB_URL);
		Database database = new Database().withName("org.jooq.meta.sqlite.SQLiteDatabase").withIncludes(".*").withExcludes("");
		Target target = new Target().withPackageName("contatti.jooq.generated").withDirectory("src-generated/");
		Generator generator = new Generator().withDatabase(database).withTarget(target);
		//generator.getGenerate().setPojos(true);
		Configuration configuration = new Configuration()
				.withJdbc(JDBC)
				.withGenerator(generator);
		GenerationTool.generate(configuration);		
	}

	
}
