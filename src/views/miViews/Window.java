package views.miViews;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){
        initWindos();
    }

    public void initWindos(){

        setSize(500, 300);
        setTitle("Cinéfilo");

        Controls text = new Controls();
        add(text);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
