package Controlers;

import java.io.IOException;
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

        try (Connection connection = DriverManager.getConnection(DBUsuario)) {
            executeScript("src/Controlers/Data.sql", connection);
        } catch (SQLException e) {
            throw new NewExceptio(e.getMessage(), DataBInit.class.getName(), "initializeDataBase()");
        }
    }

    private static void executeScript(String scriptPath, Connection connection) throws Exception {
        try {
            Path path = Paths.get(scriptPath);
            if (!Files.exists(path)) {
                throw new IOException("El archivo de script no existe: " + scriptPath);
            }
            String scriptContent = Files.readString(path);
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(scriptContent);
            }
        } catch (IOException | SQLException e) {
            throw new NewExceptio(e.getMessage(), DataBInit.class.getName(), "executeScript()");
        }
    }

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DBUsuario);
    }
}