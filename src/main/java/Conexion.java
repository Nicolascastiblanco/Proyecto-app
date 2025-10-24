
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3307/inventario_expres";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    
    public static void main(String[] args) {
        Conexion Conexion = new Conexion();
        Conexion.conectar();
    }

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}