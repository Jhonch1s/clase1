package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConection {
    private static String url = "jdbc:mysql://localhost:3306/gestion_usuarios";
    private static String usuario = "root";
    private static String contra = "";

    private static databaseConection instancia;
    private Connection conexion;


    private databaseConection() {
        try {
            conexion = DriverManager.getConnection(url, usuario, contra);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la bd: " + e.getMessage());
        }
    }

    public static databaseConection getInstancia() {
        if (instancia == null) {
            instancia = new databaseConection();
        }
        return instancia;
    }

    public Connection getConnection() {
        return conexion;
    }
}
