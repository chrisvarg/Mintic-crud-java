package views.graficos;
import javax.swing.*;

public class CreandoMarco {

    public static void main(String[] args) {

        miMarco marco1 = new miMarco();

        // Mostrar la ventana o marco
        marco1.setVisible(true);

        // permite terminan el programa cuando se cierra la ventana
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
    class miMarco extends JFrame{

        public miMarco(){
            // tamaño marco
            // setSize(500, 500);

            // Posicionamiento de la ventana en la pantalla
            //setLocation(500, 300);

            // Titulo de la ventana
            setTitle("Hola mundo");

            // combinación de setsize y setlocation
            setBounds(500, 300, 550, 250);

            // impide que se pueda redimensionar la ventana
            // setResizable(false);

            // permite abrir la ventana a pantalla completa
            //setExtendedState(Frame.MAXIMIZED_BOTH);


        }

    }
