package ControlRecetas.DataControl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBInit {

    private static final String DBUsuario = "jdbc:sqlite:GestorRecetas//src//Database//RecetarioDB.sqlite";
    public static void initializeDataBase() throws Exception{
        try (Connection connection = DriverManager.getConnection(DBUsuario)){
            executeScript("GestorRecetas/src/ControlRecetas/DataControl/Data.sql", connection);
        } catch (SQLException e) {
            throw new NewExceptio(e.getMessage(), DataBInit.class.getName(), "initializeDataBase()");
        }
    }
    private static void executeScript(String scriptPath, Connection connection) throws Exception {
        try {
            String scriptContent = Files.readString(Paths.get(scriptPath));
            Statement statement = connection.createStatement();
            statement.executeUpdate(scriptContent);
        } catch (IOException | SQLException e) {
            throw new NewExceptio(e.getMessage(), DataBInit.class.getName(), "executeScript()");
        }
    }
    public static Connection connect() throws SQLException{
        return DriverManager.getConnection(DBUsuario);
    }
}
