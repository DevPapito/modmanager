import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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

    private JLabel label01;

    public RootView() {

        icon = new ImageIcon("image.png");

        panelBody = new JPanel();
        panelProperity = new JPanel();
        panelStatus = new JPanel();


        // somente teste
        label01 = new JLabel();
        label01.setText("TESTE AQUI");
        label01.setBounds(0,0,100,60);

        this.setTitle("Teste04");
        this.setSize(440,560);
        this.setResizable(false);
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

        this.panelProperity.setLayout(null);
        //this.panelProperity.add(this.label01);

        this.panelStatus.setOpaque(true);

        this.panelStatus.setLayout(null);
        // label de teste
        this.panelStatus.add(this.label01);

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
