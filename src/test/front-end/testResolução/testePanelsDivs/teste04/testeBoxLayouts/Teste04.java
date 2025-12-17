import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

class Teste04 extends JFrame {

    private JPanel body;
    private JPanel inputUser;
    private JPanel inputEmail;
    private JPanel inputButton;

    // ------- USER

    private JLabel labelUser;

    private JTextField textUser;

    // ------- EMAIL

    private JLabel labelEmail;

    private JTextField textEmail;

    // ------- BUTTON

    private JButton buttonApply;

    public Teste04() {

        body = new JPanel();
        body.setPreferredSize(new Dimension(300,300));
        body.setBackground(Color.gray);
        body.setLayout(new BoxLayout(body,BoxLayout.PAGE_AXIS));

        inputUser = new JPanel();
        inputUser.setLayout(new FlowLayout(FlowLayout.LEADING));
        //inputUser.setBackground();

        inputEmail = new JPanel();
        inputEmail.setLayout(new FlowLayout(FlowLayout.LEADING));
        //inputEmail.setBackground();

        inputButton = new JPanel();
        inputButton.setBackground(Color.black);

        this.setTitle("Teste04");
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(0,0));

        this.add(body,BorderLayout.CENTER);

        // USER -----

        labelUser = new JLabel("Digite o seu user");
        textUser = new JTextField(20);

        inputUser.add(labelUser);
        inputUser.add(textUser);

        // EMAIL -----

        labelEmail = new JLabel("Digite seu email: ");
        textEmail = new JTextField(20);

        inputEmail.add(labelEmail);
        inputEmail.add(textEmail);

        // APPLY

        buttonApply = new JButton("Enviar!");

        inputButton.add(buttonApply);

        body.add(Box.createHorizontalGlue());
        body.add(inputUser);
//        body.add(Box.createRigidArea(new Dimension(0,10)));
        body.add(Box.createHorizontalGlue());
        body.add(inputEmail);
 //       body.add(Box.createRigidArea(new Dimension(0,10)));
        body.add(inputButton);

        this.setVisible(true);

    }

}
