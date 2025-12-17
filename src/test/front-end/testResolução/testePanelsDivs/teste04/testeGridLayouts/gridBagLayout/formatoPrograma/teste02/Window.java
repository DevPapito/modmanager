import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.Color;

class Window extends JFrame {

    private JPanel root;
    private JPanel panelProperity;
    private JPanel panelStatus;

    private JPanel formUser;
    private JPanel formEmail;

    private JLabel labelUser;
    private JTextField textUser;

    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    public Window() {

        super("Window Teste 02");

        root = new JPanel();
        panelProperity = new JPanel();
        panelStatus = new JPanel();

        formUser = new JPanel();
        formEmail = new JPanel();

        labelUser = new JLabel("Ola Mundo");
        textUser = new JTextField(20);

        this.setResizable(true);
        this.setSize(440,560);
        this.setLayout(new BorderLayout(0,0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.centralizeInScreen();

        this.jPanelRoot();

        this.jPanelProperity();

        this.jPanelStatus();

    }

    public void jPanelRoot() {

        this.add(root,BorderLayout.CENTER);

        root.setBackground(Color.white);
        root.setPreferredSize(new Dimension(100,100));
        root.setLayout(new BorderLayout(100,100));

        root.add(panelProperity,BorderLayout.NORTH);
        root.add(panelStatus,BorderLayout.SOUTH);

    }

    public void jPanelProperity() {

        panelProperity.setPreferredSize(new Dimension(0,(this.getSize().height/2)+110));
        panelProperity.setBackground(Color.green);
        panelProperity.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        labelUser.setBounds(0,0,100,50);
        textUser.setBounds(0,60,100,20);
        formUser.setBackground(Color.gray);
        formUser.setLayout(null);
        formUser.add(labelUser);
        formUser.add(textUser);

        formEmail.setBackground(Color.red);

        //gbc.gridx = 0; // melhor  com RELATIVE
        //gbc.gridy = 0;
        //gbc.gridwidth = 1;
        //gbc.gridheight = 1;
        //gbc.weightx = 1.0; // usa 100% do espaco width da div/JPanel
        //gbc.fill = GridBagConstraints.BOTH; // forca espacamento horizontal
        //gbc.anchor = GridBagConstraints.NORTHWEST;

        //gbc.ipady = 20;
        //gbc.ipadx = 20;

        // os grid(width/height) define o tamanho que pode chegar
        //gbc.gridwidth = this.getSize().width;
        //gbc.gridheight = 200;

        // define o tamanho real que pode chegar, usado o espaco do pai como base
        //gbc.weightx = 1.0;
        //gbc.weighty = 1.0;

        // Mostra como o como o componente deve seguir BOTH todos, VERTICAL e HORIZONTAL
        //gbc.fill = GridBagConstraints.BOTH;

        //gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.insets = new Insets(0,0,0,100);

        // formUser
        gbc.gridy = 0;
        gbc.weighty = 0.5;
        gbc.anchor = GridBagConstraints.NORTHWEST;

        panelProperity.add(formUser,gbc);

        gbc.gridy = 1;
        panelProperity.add(formEmail,gbc);

    }

    public void jPanelStatus() {

        panelStatus.setPreferredSize(new Dimension(0,(this.getSize().height/4)));
        panelStatus.setBackground(Color.blue);
        panelStatus.setLayout(new GridBagLayout());

    }

    public void centralizeInScreen() {

        this.setLocation((screen.width - this.getSize().width)/2,
                        (screen.height - this.getSize().height)/2);

    }

}
