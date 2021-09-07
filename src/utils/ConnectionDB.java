package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * La clase esta enfocada en realiza la conexión a la base de datos de cinefilo
 * usando la librería Connection
 *
 * @since 2021
 * @author Christian Vargas (ChrisVarg) Developer
 */
public  class ConnectionDB {

    /**
     * Método estatico que establece la conexión con mysql.
     * Al mismo tiempo recibe las credenciales de acceso en formato Json.
     *
     * @return connection, resultado de la conexión
     * @autor Christian Vargas (ChrisVarg) Developer
     */
    public static Connection getConnection()
    {

        JSONParser parser = new JSONParser();
        Connection connection = null;

        try {
            // Procesamiento credenciales (dbCredentials.json)
            String credentials = System.getProperty("user.dir") + "/src/utils/dbCredentials.json";
            JSONObject jsonObject = (JSONObject)parser.parse(new FileReader(credentials));

            String host     = (String) jsonObject.get("ip");
            String port     = (String) jsonObject.get("port");
            String username = (String) jsonObject.get("user");
            String password = (String) jsonObject.get("password");
            String dbURL = "jdbc:mysql://" + host + ":" + port + "/cinefilo";

            // conexión database
            connection = DriverManager.getConnection(dbURL, username, password);
            /*if (connection != null){
                System.out.println("Successfull Connection");
            }*/

        // Manejo de exceptions para la database y JSON
        }catch(SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException | ParseException e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
