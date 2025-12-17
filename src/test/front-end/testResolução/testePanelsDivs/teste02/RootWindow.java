import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Toolkit;

public class RootWindow extends JFrame {

    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    private JPanel panelProperity;
    private JPanel panelStatus;
    private JPanel panelCenter;
    private JPanel panelRight;

    public RootWindow() {

        ImageIcon icon = new ImageIcon("Image Icon");

        panelProperity = new JPanel();
        panelCenter = new JPanel();
        panelRight = new JPanel();
        panelStatus = new JPanel();

        this.setTitle("Teste02 divs e organização");
        this.setSize(screen.width,screen.height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 0 = gap horizontal 0 = gap vertical gap = padding
        this.setLayout(new BorderLayout(20,20)); // BorderLayout explicitamente ou nao
        this.setResizable(true);
        this.getContentPane().setBackground(new Color(0x000));

        this.setIconImage(icon.getImage());

        this.centralize();

        // add

        this.add(panelProperity,BorderLayout.NORTH);
        this.add(panelStatus,BorderLayout.SOUTH);
        this.add(panelCenter,BorderLayout.CENTER);
        this.add(panelRight,BorderLayout.WEST);

        this.dimensionPanels();
        this.colorPanels();

    }

    public void centralize() {

        this.setLocation((screen.width - this.getSize().width)/2,
                (screen.height - this.getSize().height)/2);

    }

    public void colorPanels() {

        panelProperity.setBackground(new Color(0xFF000));
        panelStatus.setBackground(new Color(0x000FF));
        panelCenter.setBackground(new Color(0xFFF4));
        panelRight.setBackground(new Color(0x0AAF3));

    }

    public void dimensionPanels() {

        panelProperity.setPreferredSize(new Dimension(100,100));
        panelStatus.setPreferredSize(new Dimension(100,100));
        panelCenter.setPreferredSize(new Dimension(100,100));
        panelRight.setPreferredSize(new Dimension(100,100));

    }

}
