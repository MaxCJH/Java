package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author franklin
 */
public class Conexion {

    //conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ventas", "root", "AQwd0g8?i&PXA57!eds1agpTbOn#VXh8LLZ3DqXp");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
