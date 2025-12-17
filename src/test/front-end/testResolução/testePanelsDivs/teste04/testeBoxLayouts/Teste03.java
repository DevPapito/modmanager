import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

class Teste03 extends JFrame {

    private JLabel label;

    private JTextField text;

    private JButton button;

    public Teste03() {

        label = new JLabel("Digite seu nome aqui: ");
        text = new JTextField(20);
        button = new JButton("Enviar");

        this.setTitle("Teste04 de boxLayout");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.LINE_AXIS));

        this.add(Box.createRigidArea(new Dimension(10,50)));
        this.add(label);
        this.add(Box.createRigidArea(new Dimension(10,50)));
        this.add(text);
        this.add(Box.createRigidArea(new Dimension(10,50)));
        this.add(button);
        this.add(Box.createRigidArea(new Dimension(10,50)));

        this.setVisible(true);

    }

}
