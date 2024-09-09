package LibroJava.Capitolo13;

public class Snippet_13_1
{
    public static void main(String[] args)
    {
        // come è dichiarato nella piattaforma Java il modulo standard java.sql
        // vedremo poi che la dichiarazione di un modulo viene effettuata in un
        // apposito file denominato module-info.java
        /*
        module java.sql 
        {
            requires transitive java.logging;
            requires transitive java.xml;
            exports java.sql;
            exports javax.sql;
            exports javax.transaction.xa;
            uses java.sql.Driver;
        } 
        */
    }
}
