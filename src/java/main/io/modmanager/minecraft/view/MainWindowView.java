package io.modmanager.minecraft.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowView extends JFrame implements ActionListener {

    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    private ImageIcon logo;

    private JPanel panelStatus;
    private JPanel panelProperitys;
    private JPanel panelTitleProperitys;
    private JPanel panelTitleStatus;

    private JLabel labelTitleProperitys;
    private JLabel labelTitleStatus;
    private JLabel labelTextPathMods;
    private JLabel labelTextPathRepository;
    private JLabel labelShowPathMods;
    private JLabel labelShowPathRepository;

    private ButtonView buttonOpenMods;
    private ButtonView buttonOpenRepository;

    public MainWindowView(String title) {

        super(title);

        logo = new ImageIcon(MainWindowView.class.getResource("/img/modManagerLogo.png"));

        // JPanel +-----

        panelStatus = new JPanel();
        panelProperitys = new JPanel();

        panelTitleProperitys = new JPanel();
        panelTitleStatus = new JPanel();

        // -----+

        // JLabel +------

        labelTitleProperitys = new JLabel("");
        labelTitleStatus = new JLabel("");

        labelTextPathMods = new JLabel("");
        labelTextPathRepository = new JLabel("");

        labelShowPathMods = new JLabel("");
        labelShowPathRepository = new JLabel("");

        // -----+

        // JButton +------

        buttonOpenMods = new ButtonView("");
        buttonOpenRepository = new ButtonView("");

        // ------+

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

        this.configJLabels();

        this.colorJLabels();

        this.fontJLabels();

        this.configJButton();

    }

    public void addJComponentsInWindow() {

        this.add(this.panelStatus,BorderLayout.SOUTH);
        this.add(this.panelProperitys,BorderLayout.CENTER);

    }

    public void addJComponentsInPanelProperitys() {

        this.panelProperitys.add(this.panelTitleProperitys);

        this.panelProperitys.add(this.labelTextPathMods);
        this.panelProperitys.add(this.labelTextPathRepository);

        this.panelProperitys.add(this.labelShowPathMods);
        this.panelProperitys.add(this.labelShowPathRepository);

        this.panelProperitys.add(this.buttonOpenMods);
        this.panelProperitys.add(this.buttonOpenRepository);

        this.panelTitleProperitys.add(this.labelTitleProperitys,BorderLayout.WEST);

    }

    public void addJComponentsInPanelStatus() {

        this.panelStatus.add(this.panelTitleStatus);

        this.panelTitleStatus.add(this.labelTitleStatus,BorderLayout.WEST);

    }

    public void configJPanels() {

        this.panelStatus.setPreferredSize(new Dimension(100,120));
        this.panelStatus.setLayout(null);
        this.panelStatus.setVisible(true);

        this.panelProperitys.setPreferredSize(new Dimension(100,80));
        this.panelProperitys.setLayout(null);
        this.panelProperitys.setVisible(true);

        this.panelTitleProperitys.setBounds(10,20,this.getSize().width-35,30);
        this.panelTitleProperitys.setLayout(new BorderLayout());

        this.panelTitleStatus.setBounds(10,10,this.getSize().width-35,30);
        this.panelTitleStatus.setLayout(new BorderLayout());

    }

    public void colorJPanels() {

        this.panelTitleStatus.setBackground(new Color(0x3CAAE8));
        this.panelTitleProperitys.setBackground(new Color(0x3CAAE8));

    }

    public void configJLabels() {

        this.labelTitleProperitys.setText("Propriedades");
        this.labelTitleProperitys.setPreferredSize(new Dimension(200,100));

        this.labelTitleStatus.setText("Status");
        this.labelTitleStatus.setPreferredSize(new Dimension(200,100));

        this.labelTextPathMods.setText("Caminho de arquivo da pasta \".minecraft\\mods\"");
        this.labelTextPathMods.setBounds(10,70,this.getSize().width-35,25);

        this.labelTextPathRepository.setText("Caminho do diretório para atualizações dos mods");
        this.labelTextPathRepository.setBounds(10,200,this.getSize().width-35,25);

        this.labelShowPathMods.setText("C:\\.minecraft\\mods");
        this.labelShowPathMods.setBounds(10,95,this.getSize().width-35,25);

        this.labelShowPathRepository.setText("C:\\home\repository");
        this.labelShowPathRepository.setBounds(10,230,this.getSize().width-35,25);

    }

    public void colorJLabels() {


        this.labelTitleProperitys.setForeground(new Color(0xCFEFFB));
        this.labelTitleStatus.setForeground(new Color(0xCFEFFB));

        this.labelTextPathMods.setForeground(new Color(0x0E0B0B));
        this.labelTextPathMods.setBackground(Color.green);
        this.labelTextPathMods.setOpaque(false);

        this.labelTextPathRepository.setForeground(new Color(0x0E0B0B));
        this.labelTextPathRepository.setBackground(Color.gray);
        this.labelTextPathRepository.setOpaque(false);

        this.labelShowPathMods.setForeground(new Color(0x0E0B0B));
        this.labelShowPathMods.setBackground(Color.white);
        this.labelShowPathMods.setOpaque(true);

        this.labelShowPathRepository.setForeground(new Color(0x0E0B0B));
        this.labelShowPathRepository.setBackground(Color.white);
        this.labelShowPathRepository.setOpaque(true);

    }

    public void fontJLabels() {

        this.labelTitleProperitys.setFont(new Font("Sans Sarif",Font.PLAIN,20));
        this.labelTitleStatus.setFont(new Font("Sans Sarif",Font.PLAIN,20));

        this.labelTextPathMods.setFont(new Font("Sans Sarif",Font.PLAIN,15));
        this.labelTextPathRepository.setFont(new Font("Sans Sarif",Font.PLAIN,15));

        this.labelTextPathMods.setFont(new Font("Sans Sarif",Font.PLAIN,15));
        this.labelTextPathRepository.setFont(new Font("Sans Sarif",Font.PLAIN,15));

        this.labelShowPathMods.setFont(new Font("Sans Sarif",Font.PLAIN,13));
        this.labelShowPathRepository.setFont(new Font("Sans Sarif",Font.PLAIN,13));

    }

    public void configJButton() {

        this.buttonOpenMods.setText("Abrir");
        this.buttonOpenMods.setBounds(10,125,100,30);
        this.buttonOpenMods.addActionListener(this);

        this.buttonOpenRepository.setText("Abrir");
        this.buttonOpenRepository.setBounds(10,260,100,30);
        this.buttonOpenRepository.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==buttonOpenMods) {

            System.out.println("Open .minecraft!");

        }else if (e.getSource()==buttonOpenRepository) {

            System.out.println("Open repository");

        }

    }

    public void centralizeScreen() {

        this.setLocation((this.screen.width - this.getSize().width)/2,
                (this.screen.height - this.getSize().height)/2);

    }

}
