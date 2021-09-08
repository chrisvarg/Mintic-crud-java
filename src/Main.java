import controllers.UsuarioService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion=0;

        do{
            System.out.println("-----------------");
            System.out.println(" Aplicación de cinéfilo");
            System.out.println(" 1. Crear nuevo usuario");
            System.out.println(" 2. Ver todos los usuarios");
            System.out.println(" 3. eliminar mensaje");
            System.out.println(" 4. editar mensaje");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    UsuarioService.insertUsuario();
                    break;
                case 2:
                    UsuarioService.getAllUsuarios();
                    break;
                case 3:
                    UsuarioService.deleteUsuario();
                    break;
                case 4:
                    UsuarioService.updateUsuarios();
                    break;
                default:
                    break;
            }

        }while(opcion != 5);
    }


}
