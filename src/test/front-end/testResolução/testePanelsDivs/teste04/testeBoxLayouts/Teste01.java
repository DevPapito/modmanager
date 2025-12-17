import javax.swing.*;

import javax.swing.BoxLayout;
import javax.swing.Box;

//import java.awt.BorderLayout;

class Teste01 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Teste borderLayout");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BoxLayout(frame,BoxLayout.LINE_AXIS));

        frame.setVisible(true);


    }

}
