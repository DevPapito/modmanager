package io.modmanager.minecraft.view;

import javax.swing.JFrame;

import java.awt.BorderLayout;

public class MainWindowView extends JFrame {

    public MainWindowView(String title) {

        super(title);

        this.setSize(440,560);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(0,0));

    }

}
