import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame implements ActionListener {

    private RoundedButton button;
//    private JButton button;

    public Window() {

        super("Teste de bottão personalizado");

        button = new RoundedButton("Injetar");
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();

        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button) {

            System.out.println("Clicado!");
            //button.setEnabled(false);

        }

    }

}
