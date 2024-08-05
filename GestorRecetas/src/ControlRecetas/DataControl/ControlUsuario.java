package ControlRecetas.DataControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControlUsuario {
    public static boolean registrarUsuario(String username, String password) throws SQLException{
        String insertUserSQL = "INSERT INTO Users(UserName, Clave) VALUES(?, ?)";
        try (Connection connection = DataBInit.connect();
            PreparedStatement prepStatm = connection.prepareStatement(insertUserSQL)){
                prepStatm.setString(1, username);
                prepStatm.setString(2, password);
                int affectedRows = prepStatm.executeUpdate();
                return affectedRows > 0;
            }
        }
    
    public static boolean authenticateUser(String username, String password) throws SQLException{
        String selectUserSQL = "SELECT * FROM Users WHERE UserName = ? AND Clave = ?";
        try(Connection connection = DataBInit.connect(); 
            PreparedStatement preparedStatement = connection.prepareStatement(selectUserSQL)){
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                ResultSet rs = preparedStatement.executeQuery();
                return rs.next();
            }
    }
}
