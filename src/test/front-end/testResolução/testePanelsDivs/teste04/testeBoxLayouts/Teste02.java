import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

class Teste02 extends JFrame {

    private JPanel panel;

    private JButton button;

    private JLabel label;

    private JTextField text;

    public Teste02() {

        panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setLayout(new BoxLayout(panel,BoxLayout.LINE_AXIS));
        panel.setPreferredSize(new Dimension(0,0));

        label = new JLabel("Aqui a uma label");

        button = new JButton("Enviar!");

        text = new JTextField(20);

        this.setTitle("Teste02 BoxLayout");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(0,0));

        this.add(panel,BorderLayout.CENTER);

        panel.add(label);
        panel.add(text);
        panel.add(button);

        this.setVisible(true);

    }

}
