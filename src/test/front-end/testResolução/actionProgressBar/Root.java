import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JProgressBar;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Root extends JFrame implements ActionListener{

    private JProgressBar loadingBar;

    private JButton button;

    public Root() {

        super("Teste progress bar!");

        loadingBar = new JProgressBar();

        // valor inicial
        loadingBar.setValue(0);
        // Permite a mostragem de porcentagem do loadingBar
        loadingBar.setStringPainted(true);

        button = new JButton("Click to up 10 points");
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new BorderLayout(0,0));

        this.add(button,BorderLayout.NORTH);
        this.add(loadingBar,BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button) {

            if (loadingBar.getValue() >= 100) {

                this.button.setEnabled(false);
                this.loadingBar.setString("FEITO!");

            }else {

                this.loadingBar.setValue(loadingBar.getValue()+10);

            }


        }

    }

}
