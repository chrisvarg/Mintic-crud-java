package views.miViews;

import javax.swing.*;
import java.awt.*;

public class Controls extends JPanel {

    private JLabel lblTitle;

    public Controls()
    {
        initComponent();
    }
    private void initComponent()
    {
        // Titulo
        setBackground(new Color(34, 34, 34));
        this.lblTitle = new JLabel("Bienvenido a Cinefilo");
        add(this.getLblTitle());
        lblTitle.setForeground(new Color(255, 255, 255));
        lblTitle.setFont(new Font("Roboto", Font.BOLD, 20));

        // Botones

    }

    public JLabel getLblTitle() {
        return lblTitle;
    }

    public void setLblTitle(JLabel lblTitle) {
        this.lblTitle = lblTitle;
    }




}
