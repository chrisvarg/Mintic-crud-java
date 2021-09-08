package controllers;

import access.UsuarioDAO;
import models.Usuario;
import utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UsuarioService {
    public static void insertUsuario()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Escribe tu alias: ");
        String alias = input.nextLine();

        System.out.print("Escribe tu nombre: ");
        String name = input.nextLine();

        System.out.print("Escribe tus apellidos: ");
        String lastName = input.nextLine();

        System.out.print("Escribe tu número de celular: ");
        String telephone = input.nextLine();

        System.out.print("Escribe tu email: ");
        String email = input.nextLine();

        System.out.print("Escribe tu contraseña: ");
        String password = input.nextLine();

        System.out.print("Escribe tu fecha de nacimiento: ");
        String date = input.nextLine();

        Usuario usuario = new Usuario(alias, name, lastName, telephone, email, password, date);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.insertUsuario(usuario);
    }

    public static void getAllUsuarios()
    {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.getAllUsuarios();
    }

    public static void deleteUsuario()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Indica nombre del alias a borrar: ");
        String alias = input.nextLine();

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.deleteUsuario(alias);
    }

    public static void updateUsuarios()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba tu nueva contraseña: ");
        String password = input.nextLine();

        System.out.print("Escriba tu nombre de alias: ");
        String alias = input.nextLine();

        Usuario actualizar = new Usuario();
        actualizar.setPassword(password);
        actualizar.setAlias(alias);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.updateUsuarios(actualizar);
    }

}
