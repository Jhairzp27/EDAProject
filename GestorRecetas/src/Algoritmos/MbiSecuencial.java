package Algoritmos;

import Controlers.DataBInit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MbiSecuencial {

    // Búsqueda secuencial para nombres de recetas
    public static int busquedaSecuencial(RecetaConstr[] recetas, String nombreBuscado) {
        int i = 0;
        int N = recetas.length;
        while (i < N && !recetas[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
            i++;
        }

        if (i >= N) {
            JOptionPane.showMessageDialog(null, "La receta no está en el arreglo.");
            return -1; // Indica que no se encontró
        } else {
            JOptionPane.showMessageDialog(null, "La receta sí está en el arreglo en la posición: " + i);
            return i; // Retorna la posición donde se encontró
        }
    }

    // Método para obtener los nombres de las recetas del usuario desde la base de datos
    public static ListaRecetas obtenerNombresRecetas(int userId) {
        ListaRecetas listaRecetas = new ListaRecetas();
        try (Connection conn = DataBInit.connect()) {
            String query = "SELECT IdReceta, NombreReceta FROM Recetas WHERE IdUser = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int idReceta = rs.getInt("IdReceta");
                String nombreReceta = rs.getString("NombreReceta");
                listaRecetas.add(new RecetaConstr(idReceta, nombreReceta));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaRecetas;
    }
}
