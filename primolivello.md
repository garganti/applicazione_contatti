### 1. livello dati - progetto DB

Il livello dati, in alcuni casi chiamato *tier database*, tier accesso ai dati o back-end, 
è il punto in cui vengono archiviate e gestite su un DB le informazioni elaborate dall'applicazione. 
Questo può essere un sistema di gestione del database relazionale come PostgreSQL, MySQL, MariaDB, Oracle, DB2, Informix o Microsoft SQL Server 
o in un server del database  NoSQL come Cassandra, CouchDB o MongoDB. 

Nel nostro caso vogliamo usare **SQLite** (https://www.sqlite.org) che è un db relazionale basato su SQL che però non richiede l'installazione di un servizio. 
Tutte i dati del db (e la struttura stessa del DB) sono in un unico file (con estensione ```.db3```). SQLite non è un processo standalone utilizzabile di per sé, ma può essere incorporato all'interno di un altro programma.

## Come creare il progetto DB e fare delle operazioni sul DB

1. creiamo un progetto java normale
2. trasformiamo in maven ()
3. aggiungiamo le dipendenze nel pom
4. scriviamo il codice per creare il DB
5. proviamo a fare alcune query
6. se vogliamo possiamo vedere il DB con https://sqlitebrowser.org/

Vediamo i singoli passi.

### 1. creazione di un progetto java 
Al solito, new java project
### 2. trasformazione in maven
come si fa ..
Il passo 1 e 2 possono essere uniti se si crea direttamente un progetto maven.
### 3. aggiunta delle dipendenze nel pom
Nel pom.xml dobbiamo aggiungere le dipendenze:
```xml
<dependency>
    <groupId>org.xerial</groupId>
    <artifactId>sqlite-jdbc</artifactId>
    <version>3.43.2.2</version>
</dependency>
```
### 4. creazione del DB
Il DB sarà in un file, chiamiamolo ```indirizzi.db3``` e decidiamo di metterlo nella directory XXX (da decidere). 
BOH Vogliamo almeno inizialmente anche mettere questo bb su github così chiunque potrà quando fa il clone avere già un db con alcuni dati.
Per rifermi al file db dovrò usare l'url così composta: ```jdbc:sqlite:<PERCORSO DEL FILE>```. 
Non volendo inserire percorsi assoluti, userò solo percorsi relativi. Così chiunque aprirà il progetto potrà eseguirelo senza dove rmodificare nulla.

> Se usi dei percorsi come ```jdbc:sqlite:C:\Users\Angelo\Desktop\Progetto\indirizzi.db3```
> chiunque aprirà il progetto avrà dei problemi perchè poi il progetto non esiste

Possiamo quindi scrivere un main in cui proviamo a vedere se crea il DB:
```java
public static String DB_URL = "../db/indirizzi.db3"

try {
  Connection conn = DriverManager.getConnection("jdbc:sqlite:"+DB_URL);
  if (conn != null) {
    DatabaseMetaData meta = conn.getMetaData();
    System.out.println("The driver name is " + meta.getDriverName());
    System.out.println("A new database has been created.");
  }
} catch (SQLException e) {
  System.out.println(e.getMessage());
}
```
Dove la classe ```DriverManager``` va importata dalla libreria SQLite.
Se eseguiami il codice sopra, il programma crea il file se non esiste già.

### 5. proviamo a fare alcune query
Possiamo a questo punto fare delle query SQL sul db. Queste query sono scritte direttamente usando **SQL**.
#### A. creazione di una tabella con degli indirizzi
```java
try (Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				Statement stmt = conn.createStatement();
				String sql = "CREATE TABLE INDIRIZZI (" + 
								" NOME        TEXT," + 
								" NUMTELEFONO TEXT )";
				stmt.executeUpdate(sql);
				stmt.close();
				conn.close();
				System.out.println("Table created successfully");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
```



