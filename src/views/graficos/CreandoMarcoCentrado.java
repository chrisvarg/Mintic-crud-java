package views.graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {

    public static void main(String[] args) {
        MarcoCentrado marcoCentrado = new MarcoCentrado();
        marcoCentrado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoCentrado extends JFrame
{
    public MarcoCentrado()
    {
        // creación objeto Toolkit
        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        // me dice el tamaño de mi pantalla primaria (ancho y largo)
        Dimension sizeScreen = miPantalla.getScreenSize();
        // me obtiene el alto de mi pantalla
        int altura = sizeScreen.height;
        int ancho = sizeScreen.width;

        setSize(ancho/2, altura/2);
        setLocation(ancho/4, altura/4);
        setTitle("marcoCentrado");
        setVisible(true);

        // Cambiar el icono de la ventana
        Image miIcon = miPantalla.getImage("src/views/icono.png"); // lo busca
        // lo establece
        setIconImage(miIcon);
    }
}
