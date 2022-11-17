# applicazione_contatti - design + prototipo

Prova di applicazione per ing. del software per gestione dei contatti. Ogni contatto è un indirizzo e un nome.

è un esempio di architettura a tre livelli.

Il primo livello è quello dei Database layer ed è il progetto contatti_db_sqlite

Il secondo livello business e persistenza è il progetto  contatti_jooq

il terzo livello è quello di presentazione con vaadin ed è il progetto contatti_webapp

## passo dopo passo

### 1. progetto DB

E' basato su SQLite (https://www.sqlite.org) che mantiene tutto il DB in un unico file.

1. creiamo un progetto 
2. trasformiamo in maven 
3. aggiungiamo le dipendenze nel pom
4. scriviamo il codice per creare il DB e fare alcune query
5. se vogliamo possiamo vedere il DB con https://sqlitebrowser.org/

### 2. progetto JOOQ
E' basato su JOOQ (https://www.jooq.org/) che crea a partre da un DB le classi java per la persistenza (senza scrivere SQL)

1-3 come prima
4. scriviamo il codice per generare le classi (in alternativa si può fare con maven)
5. scriviamo del codice di esempio di accesso al DB

### 3. progetto webapp vaadin
E' basato su vaadin (https://vaadin.com/) che permette di scrivere una web app interamente in java

https://start.vaadin.com/app

1. scarichiamo un progetto d'esempio da https://vaadin.com/hello-world-starters puro java 
2. lo salviamo le lo aprimo con eclipse come progetto maven
3. lo eseguiamo con run maven jetty:run
4. lo modifichiamo per visualizzare in una grid il contenuto del DB




