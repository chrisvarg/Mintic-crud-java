package views.IntellJ;

import javax.swing.*;

public class Window extends JFrame {
    public Window()
    {
        setTitle("Cinefilos IntellJ");
        setBounds(50, 50, 600, 300);

        MyView lamina = new MyView();
        add(lamina);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
