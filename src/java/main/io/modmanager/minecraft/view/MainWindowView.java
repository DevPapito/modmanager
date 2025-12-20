package io.modmanager.minecraft.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Color;

public class MainWindowView extends JFrame {

    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    private ImageIcon logo;

    private JPanel panelStatus;
    private JPanel panelProperitys;

    public MainWindowView(String title) {

        super(title);

        logo = new ImageIcon(MainWindowView.class.getResource("/img/modManagerLogo.png"));

        // JPanel +-----

        panelStatus = new JPanel();
        panelProperitys = new JPanel();

        // -----+

        this.setSize(440,560);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(0,0));
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(new Color(0xFFF8F7));

        this.centralizeScreen();

        this.addJComponentsInWindow();

        this.configJPanels();

        this.colorJPanels();

    }

    public void addJComponentsInWindow() {

        this.add(this.panelStatus,BorderLayout.SOUTH);
        this.add(this.panelProperitys,BorderLayout.CENTER);

    }

    public void configJPanels() {

        this.panelStatus.setPreferredSize(new Dimension(0,120));
        this.panelStatus.setVisible(false);

        this.panelProperitys.setPreferredSize(new Dimension(0,80));
        this.panelProperitys.setVisible(false);

    }

    public void colorJPanels() {

        this.panelStatus.setBackground(Color.red);
        this.panelProperitys.setBackground(Color.blue);

    }

    public void centralizeScreen() {

        this.setLocation((this.screen.width - this.getSize().width)/2,
                (this.screen.height - this.getSize().height)/2);

    }

}
