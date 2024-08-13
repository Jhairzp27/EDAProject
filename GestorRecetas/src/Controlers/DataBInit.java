package Controlers;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBInit {

    private static final String DB_PATH = "src/Database/RecetarioDB.sqlite";
    private static final String DBUsuario = "jdbc:sqlite:" + DB_PATH;

    public static void initializeDataBase() throws Exception {
        // Crear la carpeta de la base de datos si no existe
        Path dbDir = Paths.get("src/Database");
        if (!Files.exists(dbDir)) {
            Files.createDirectories(dbDir);
        }

        try (Connection connection = DriverManager.getConnection(DBUsuario);
             Statement statement = connection.createStatement()) {
            
            // Crear tablas directamente en código Java
            String createUsersTable = "CREATE TABLE IF NOT EXISTS Users (" +
                    "IdUser INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "UserName TEXT NOT NULL UNIQUE," +
                    "Clave TEXT NOT NULL," +
                    "FechaCreacion DATETIME NOT NULL DEFAULT (DATETIME('NOW', 'LOCALTIME'))" +
                    ");";

            String createRecetasTable = "CREATE TABLE IF NOT EXISTS Recetas (" +
                    "IdReceta INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "IdUser INTEGER NOT NULL," +
                    "NombreReceta TEXT NOT NULL," +
                    "FOREIGN KEY (IdUser) REFERENCES Users (IdUser)" +
                    ");";

            String createIngredientesTable = "CREATE TABLE IF NOT EXISTS Ingredientes (" +
                    "IdIngredientes INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "IdReceta INTEGER NOT NULL," +
                    "NombreIngrediente TEXT NOT NULL," +
                    "Cantidad TEXT," +
                    "FOREIGN KEY (IdReceta) REFERENCES Recetas (IdReceta)" +
                    ");";
            
            // Ejecutar la creación de las tablas
            statement.execute(createUsersTable);
            statement.execute(createRecetasTable);
            statement.execute(createIngredientesTable);

        } catch (SQLException e) {
            throw new NewExceptio(e.getMessage(), DataBInit.class.getName(), "initializeDataBase()");
        }
    }

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DBUsuario);
    }
}
