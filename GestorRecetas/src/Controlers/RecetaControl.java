package Controlers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecetaControl {
    public static void agregoReceta(int userId, String nombreReceta) throws SQLException {
        String sql = "INSERT INTO Recetas (IdUser, NombreReceta) VALUES(?, ?)";
        try (Connection connection = DataBInit.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, userId);
            preparedStatement.setString(2, nombreReceta);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
            System.out.println(userId);
        }
    }

    public static void agregarIngrediente(int idReceta, String nombreIngrediente, String cantidad) throws SQLException {
        String sql = "INSERT INTO Ingredientes(IdReceta, NombreIngrediente, Cantidad) VALUES(?, ?, ?)";
        try (Connection connection = DataBInit.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idReceta);
            preparedStatement.setString(2, nombreIngrediente);
            preparedStatement.setString(3, cantidad);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        }
    }

    public static int getRecipeId(String recipeName, int userId) throws SQLException {
        String sql = "SELECT IdReceta FROM Recetas WHERE NombreReceta = ? AND IdUser = ?";
        try (Connection conn = DataBInit.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, recipeName);
            pstmt.setInt(2, userId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("IdReceta");
            }
        }
        return -1; // Indica que no se encontró la receta
    }
}
