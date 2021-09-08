package access;

import models.Usuario;
import utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Es una clase que contiene el DAO de la clase usuario,
 * contiene todos los métodos que van a permitir
 * la clase para acceder a la información de la base de datos.
 * <p></p><strong>DAO - Data Access Object</strong>
 * DAO - Data Access Object
 * <p></p>
 * @since 2021
 * @author  Christian Vargas (ChrisVarg) Developer
 *
 */
public class UsuarioDAO {

    // private ConnectionDB connection = null;

    public void insertUsuario(Usuario usuario)
    {
        ConnectionDB connectDB = new ConnectionDB();
        try (Connection connection = connectDB.getConnection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO usuario(alias, nombre, apellidos, celular, email, password, fecha_nacimiento) " +
                        "VALUES(?, ?, ?, ?, ?, ?, ?)";
                ps=connection.prepareStatement(query);
                ps.setString(1, usuario.getAlias());
                ps.setString(2, usuario.getName());
                ps.setString(3, usuario.getLastaName());
                ps.setString(4, usuario.getTelephone());
                ps.setString(5, usuario.getEmail());
                ps.setString(6, usuario.getPassword());
                ps.setString(7, usuario.getDate());

                ps.executeUpdate();
                System.out.println("Usuario creado");

            }catch(SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }

        System.out.println("Creando todos un Usuario");
    }
    public void getAllUsuarios()
    {
        ConnectionDB connectDB = new ConnectionDB();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = connectDB.getConnection()){
            String query = "SELECT * FROM usuario;";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("Alias: " + rs.getString("alias"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellidos: " + rs.getString("apellidos"));
                System.out.println("Celular: " + rs.getString("celular"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Contraseña: " + rs.getString("password"));
                System.out.println("Fecha Nacimiento: " + rs.getString("fecha_nacimiento"));
                System.out.println("");
            }


        }catch(SQLException e){
            System.out.println("No se recuperaron los mensajes");
            System.out.println(e);
        }
    }


    public void deleteUsuario(String alias)
    {
        ConnectionDB connectDB = new ConnectionDB();
        try (Connection connection = connectDB.getConnection()){
            PreparedStatement ps = null;

            try{
                String query = "DELETE FROM usuario WHERE alias = ?;";
                ps = connection.prepareStatement(query);
                ps.setString(1, alias);
                ps.executeUpdate();
                System.out.println("El usuario ha sido Borrado");

            }catch(SQLException e){
                System.out.println(e);
                System.out.println("No se pudo borrar el mensaje");
            }

        }catch(SQLException e){
            System.out.println(e);
        }

    }

    public void updateUsuarios(Usuario usuario)
    {
        ConnectionDB connectDB = new ConnectionDB();

        try (Connection connection = connectDB.getConnection()) {

            PreparedStatement ps = null;
            try{

                String query = "UPDATE usuario SET password = ? WHERE alias = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, usuario.getPassword());
                ps.setString(2, usuario.getAlias());
                ps.executeUpdate();
                System.out.println("La contraseña se actualizo correctamente");

            }catch(SQLException ex){
                System.out.println(ex);
                System.out.println("No se actualizó el mensaje");
            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
