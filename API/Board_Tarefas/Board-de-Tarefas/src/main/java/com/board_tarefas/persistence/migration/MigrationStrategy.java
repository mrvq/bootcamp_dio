package main.java.com.board_tarefas.persistence.migration;

import java.sql.Connection;
import java.sql.SQLException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

import liquibase.Liquibase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;

@AllArgsConstructor
public class MigrationStrategy {

    private final Connection connection;

    public void executeMigration() {
        var originalOut = System.out;
        var originalErr = System.err;
        try (var fos = new FileOutputStream("liquibase.log")) {
            System.setOut(new PrintStream(fos));
            System.setErr(new PrintStream(fos));
            try (
                    var connection = getConnection();
                    var jdbcConnection = new JdbcConnection(connection);) {
                var liquibase = new Liquibase(
                        "/db/changelog/db.changelog-master.yml",
                        new ClassLoaderResourceAccessor(),
                        jdbcConnection);
                liquibase.update();
            } catch (SQLException | LiquibaseException e) {
                e.printStackTrace();
                System.setErr(originalErr);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }
    }

}