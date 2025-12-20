package io.modmanager.minecraft.view;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Dimension;

public class MainWindowView extends JFrame {

    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    private ImageIcon logo;

    public MainWindowView(String title) {

        super(title);

        logo = new ImageIcon(MainWindowView.class.getResource("/img/modManagerLogo.png"));

        this.setSize(440,560);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(0,0));
        this.setIconImage(logo.getImage());

        this.centralizeScreen();

    }

    public void centralizeScreen() {

        this.setLocation((this.screen.width - this.getSize().width)/2,
                (this.screen.height - this.getSize().height)/2);

    }

}
