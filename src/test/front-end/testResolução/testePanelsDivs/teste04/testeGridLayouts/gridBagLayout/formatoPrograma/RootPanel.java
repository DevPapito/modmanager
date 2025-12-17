import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;

class RootPanel extends JPanel {

    private JPanel panelProcess;
    private JPanel panelStatus;

    private int height;
    private int width;

    public RootPanel() {

        this.initializer();
    }

    private void initializer() {

        setLayout(new BorderLayout(0,0));
        setPreferredSize(new Dimension(100,100));

        panelProcess = new JPanel();
        panelProcess.setBackground(Color.blue);
        panelProcess.setPreferredSize(new Dimension(0,this.getSize().height/2));

        panelStatus = new JPanel();
        panelStatus.setBackground(Color.green);
        panelProcess.setPreferredSize(new Dimension(0,this.getSize().height));

        this.add(panelProcess,BorderLayout.NORTH);
        this.add(panelStatus,BorderLayout.CENTER);

    }

    public void setWindow(int height, int width) {

        this.height =  height;
        this.width =  width;

    }

}

