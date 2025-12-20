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
    private JPanel panelTitleProperitys;
    private JPanel panelTitleStatus;

    public MainWindowView(String title) {

        super(title);

        logo = new ImageIcon(MainWindowView.class.getResource("/img/modManagerLogo.png"));

        // JPanel +-----

        panelStatus = new JPanel();
        panelProperitys = new JPanel();

        panelTitleProperitys = new JPanel();
        panelTitleStatus = new JPanel();

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

        this.addJComponentsInPanelProperitys();
        this.addJComponentsInPanelStatus();

    }

    public void addJComponentsInWindow() {

        this.add(this.panelStatus,BorderLayout.SOUTH);
        this.add(this.panelProperitys,BorderLayout.CENTER);

    }

    public void addJComponentsInPanelProperitys() {

        this.panelProperitys.add(this.panelTitleProperitys);

    }

    public void addJComponentsInPanelStatus() {

        this.panelStatus.add(this.panelTitleStatus);

    }

    public void configJPanels() {

        this.panelStatus.setPreferredSize(new Dimension(0,120));
        this.panelStatus.setLayout(null);
        this.panelStatus.setVisible(true);

        this.panelProperitys.setPreferredSize(new Dimension(0,80));
        this.panelProperitys.setLayout(null);
        this.panelProperitys.setVisible(true);

        this.panelTitleStatus.setBounds(10,20,this.getSize().width-35,30);

        this.panelTitleProperitys.setBounds(10,20,this.getSize().width-35,30);
    }

    public void colorJPanels() {

        this.panelTitleStatus.setBackground(new Color(0x3CAAE8));
        this.panelTitleProperitys.setBackground(new Color(0x3CAAE8));

    }

    public void centralizeScreen() {

        this.setLocation((this.screen.width - this.getSize().width)/2,
                (this.screen.height - this.getSize().height)/2);

    }

}
