
package controlador;

import Modelo.Conexion;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ControlLogin {

    public boolean validarUsuario(Usuario usuario) {
        boolean valido = false;

        String sql = "SELECT * FROM usuario WHERE nombre_usuario = ? AND contrasena = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContraseña());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                valido = true; // encontró coincidencia
            }

        } catch (SQLException e) {
            System.out.println("Error en validación: " + e.getMessage());
        }

        return valido;
    }
}
