package views.graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {
    public static void main(String[] args) {
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame{

    public MarcoConTexto(){

        setVisible(true);
        setSize(600, 450);
        setBounds(400, 200, 600, 450);
        setTitle("Mi primer Texto");

        // Incluir la lamina al marco
        Lamina miLamina = new Lamina();
        add(miLamina); // añade la lamina al panel
    }
}

class Lamina extends JPanel{
    // Construcción del panel
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo SWING", 100, 100);
    }

}
