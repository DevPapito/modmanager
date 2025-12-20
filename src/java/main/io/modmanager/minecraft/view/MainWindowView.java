package io.modmanager.minecraft.view;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Dimension;

public class MainWindowView extends JFrame {

    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    public MainWindowView(String title) {

        super(title);

        this.setSize(440,560);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(0,0));

        this.centralizeScreen();

    }

    public void centralizeScreen() {

        this.setLocation((this.screen.width - this.getSize().width)/2,
                (this.screen.height - this.getSize().height)/2);

    }

}
