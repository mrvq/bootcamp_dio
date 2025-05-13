package main.java.com.board_tarefas;

public class Application {

    public static void main(String[] args) {

        try {
            var connection = ConnectionConfig.getConnection();
            var migrationStrategy = new MigrationStrategy(connection);
            migrationStrategy.executeMigration();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
