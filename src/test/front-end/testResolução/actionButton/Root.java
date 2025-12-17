import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Root extends JFrame implements ActionListener {

    private JButton button;

    private JLabel label;

    public Root() {

        super("Teste 01 button");

        button = new JButton("<html><h1>Clique aqui!</h1></html>");
        button.addActionListener(this);

        label = new JLabel("");

        this.setSize(440,560);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button,BorderLayout.CENTER);
        this.add(label,BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button) {

            System.out.println("Aqui foi o codigo");
            this.label.setText("<html><i>Clicado!</i></html>");
            this.button.setEnabled(false);

        }

    }

}
