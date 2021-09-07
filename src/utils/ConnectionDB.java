package utils;

import com.mysql.cj.xdevapi.JsonParser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * La clase esta enfocada en realiza la conexión a la base de datos de cinefilo
 * usando la librería Connection
 *
 * @since 2021
 * @author Christian Vargas
 */
public  class ConnectionDB {


    /**
     * Método que establece la conexión con mysql.
     * Al mismo tiempo recibe las credenciales de acceso en formato Json.
     *
     * @autor Christian Vargas (ChrisVarg) Developer
     */
    public static Connection getConnection()
    {
        JsonParser parser = new JsonParser();
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinefilo", "root", "contraseña");
            if (connection != null){
                System.out.println("Successfull Connection");
            }
        }catch(SQLException e) {
            System.out.println(e + " nada");
        }
        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
