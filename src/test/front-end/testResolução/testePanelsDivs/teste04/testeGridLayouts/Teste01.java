import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridLayout;

class Teste01 extends JFrame {

    private JLabel labelUser;
    private JLabel labelEmail;

    private JTextField textUser;
    private JTextField textEmail;

    private JButton button;

    public Teste01() {

        labelUser = new JLabel("Digite o seu nome: ");
        labelEmail = new JLabel("Digite a seu email: ");

        textUser = new JTextField(20);
        textEmail = new JTextField(20);

        button = new JButton("Enviar!");

        this.setTitle("Teste01 gridLayout");
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(5,1));

        this.add(labelUser);
        this.add(textUser);
        this.add(labelEmail);
        this.add(textEmail);
        this.add(button);


        this.setVisible(true);

    }

}
