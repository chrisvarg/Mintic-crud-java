package views.graficos;

import javax.swing.*;
import java.awt.*;

public class Pruebas {

    public static void main(String[] args) {
        // Ventana para ingresar datos
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        boolean isFont = false;


        // Ver todas  las fuentes del pc
        String[] nameFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nameFont: nameFonts) {
            if (nameFont.equals(fuente)){
                isFont = true;
            }
        }
        if (isFont){
            System.out.println("Instalada");
        }else{
            System.out.println("No esta intalada");
        }
    }

}
