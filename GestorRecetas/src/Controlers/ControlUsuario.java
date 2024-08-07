package Controlers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControlUsuario {
    public static boolean registrarUsuario(String username, String password) throws SQLException {
        String insertUserSQL = "INSERT INTO Users(UserName, Clave) VALUES(?, ?)";
        try (Connection connection = DataBInit.connect();
             PreparedStatement prepStatm = connection.prepareStatement(insertUserSQL)) {
            prepStatm.setString(1, username);
            prepStatm.setString(2, password);
            int affectedRows = prepStatm.executeUpdate();
            return affectedRows > 0;
        }
    }

    public static int authenticateUser(String username, String password) throws SQLException {
        String selectUserSQL = "SELECT IdUser FROM Users WHERE UserName = ? AND Clave = ?";
        try (Connection connection = DataBInit.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(selectUserSQL)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getInt("IdUser");
            }
        }
        return -1; // Indica que el usuario no fue autenticado
    }
    
}
