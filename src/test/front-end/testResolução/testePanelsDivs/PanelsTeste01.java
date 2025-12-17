import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;

public class PanelsTeste01 extends JFrame {

    private JPanel panelProcess;
    private JPanel panelStatus;

    public PanelsTeste01() {

        // Instancia dos paineis

        panelProcess = new JPanel();
        panelStatus = new JPanel();

        ImageIcon icon = new ImageIcon("caminho da imagem");

        this.setTitle("Teste dos painels divs");
        this.setVisible(true);

        this.setSize(440,560);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.getContentPane().setBackground(new Color(0x000));

        this.centralize();

        // add panels/divs

        this.add(panelProcess);
        this.add(panelStatus);

        // Não sei se esta em ordem correta
        this.colorPanels();
        this.dimesionPanels();

    }

    public void centralize() {

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        this.setLocation((screen.width - this.getSize().width)/2,
                (screen.height - this.getSize().height)/2);

    }

    public void colorPanels() {

        panelProcess.setBackground(new Color(0xFF000));
        panelStatus.setBackground(new Color(0x000FF));

    }

    public void dimesionPanels() {

        int heightProcess = (this.getSize().height/2);

        this.panelProcess.setBounds(0,0,this.getSize().width,heightProcess);

        this.panelStatus.setBounds(0,heightProcess,this.getSize().width,this.getSize().height/2);

        //panelProcess.setPreferredSize(new Dimension(this.getSize().width,this.getSize().height/2));

    }

}
