package views.graficos;

import javax.swing.*;
import java.awt.*;

//DARLE COLOR A LAS FUENTES

public class MarcoFuentes {
//    LLAMAR LA VENTANA
    public static void main(String[] args) {
        MarcoFuente marco = new MarcoFuente();
    }
}

class MarcoFuente extends JFrame
{
    public MarcoFuente()
    {
//        VENTANA
        setTitle("Pruebas");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        LaminaFuentes lamina = new LaminaFuentes();
        add(lamina);
        // Darle color a las fuentes de forma universal a la lamina
        lamina.setForeground(Color.blue);

        setVisible(true);
    }
}

class LaminaFuentes extends JPanel
{
//    PANEL Y LAS FUENTES
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Font fuente = new Font("Arial", Font.BOLD, 26);
        g2.setFont(fuente);
//        g2.setColor(new Color(255, 255, 7));
        g2.drawString("Juan", 100, 100);

        g2.setFont(new Font("Robot", Font.ITALIC, 15));
//        g2.setColor(new Color(128, 90, 50).brighter());
        g2.drawString("Curso de Java", 100, 200);
    }


}
