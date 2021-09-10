package views.eventos;

import javax.swing.*;

public class MarcoBotones {

    public static void main(String[] args) {
        Window ventada = new Window();
        ventada.setVisible(true);
        ventada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Window extends JFrame
{
    public Window()
    {
        setTitle("Botones y Eventos");
        setBounds(500, 300, 500, 300);


        LaminaBoton lamina = new LaminaBoton();
        add(lamina);
    }
}

class LaminaBoton extends JPanel
{
    JButton botonAzul = new JButton("Azul");
    public LaminaBoton()
    {
        add(botonAzul);
    }
}
