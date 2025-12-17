import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class RootView extends JFrame {

    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    private ImageIcon icon;

    private JPanel panelBody;
    private JPanel panelProperity;
    private JPanel panelStatus;

    private JLabel labelDirectoreMinecraft;
    private JLabel labelDirectoreMods;

    private JTextField TextFieldDirectoreMinecraft;
    private JTextField TextFieldDirectoreMods;

    private JButton ButtonApply;

    public RootView() {

        icon = new ImageIcon("image.png");

        panelBody = new JPanel();
        panelProperity = new JPanel();
        panelStatus = new JPanel();

        labelDirectoreMinecraft = new JLabel("Digite abaixo o diretorio do seu .minecraft");
        labelDirectoreMods = new JLabel("Digite abaixo o diretorio de mods");

        TextFieldDirectoreMinecraft = new JTextField(20);
        TextFieldDirectoreMods = new JTextField(20);

        ButtonApply = new JButton("Enviar!");

        this.setTitle("Teste04");
        this.setSize(440,560);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(0,0));
        this.setIconImage(icon.getImage());

        this.getContentPane().setBackground(new Color(0x000));

        this.centralize();

        this.jcomponentsRoot();
        this.jcomponentsPanel();

        this.colorPanels();

        this.dimensionPanels();

        // Para resolver problema de visibilidade inicial
        this.setVisible(true);

    }

    public void jcomponentsRoot() {

        this.add(this.panelBody,BorderLayout.CENTER);

    }

    // Ideal sempre usando borderLayout é
    // conter sempre um center
    public void jcomponentsPanel() {

        this.panelBody.setLayout(new BorderLayout(0,0));

        this.panelBody.add(this.panelProperity,BorderLayout.NORTH);
        this.panelBody.add(this.panelStatus,BorderLayout.CENTER);

        this.panelProperity.setOpaque(true);
        this.panelProperity.setLayout(new BoxLayout(this.panelProperity, BoxLayout.Y_AXIS));

        this.panelProperity.add(this.labelDirectoreMinecraft);
        this.panelProperity.add(this.TextFieldDirectoreMinecraft);
        this.panelProperity.add(Box.createRigidArea(new Dimension(0,10)));

        this.panelProperity.add(this.labelDirectoreMods);
        this.panelProperity.add(this.TextFieldDirectoreMods);
        this.panelProperity.add(Box.createRigidArea(new Dimension(0,10)));
        this.panelProperity.add(this.ButtonApply);

        this.panelStatus.setOpaque(true);
        this.panelStatus.setLayout(null);

    }

    public void centralize() {

        this.setLocation((screen.width - this.getSize().width)/2,
                (screen.height - this.getSize().height)/2);

    }

    public void colorPanels() {

        this.panelBody.setBackground(new Color(0xFFFF));
        this.panelProperity.setBackground(new Color(0xFF00));
        this.panelStatus.setBackground(new Color(0x00FF));

    }

    public void dimensionPanels() {

        this.panelBody.setPreferredSize(new Dimension(100,100));

        this.panelProperity.setPreferredSize(new Dimension(100,(this.getSize().height/2)+100));
        this.panelStatus.setPreferredSize(new Dimension(100,(this.getSize().height/2)-100));

    }

}
