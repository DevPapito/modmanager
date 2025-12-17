import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

class GridTeste extends JPanel{

    private GridBagLayout layout;

    public GridTeste() {

        this.initialize();

    }

    private void initialize() {

        setPreferredSize(new Dimension());
        layout = new GridBagLayout();
        this.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();

        //gbc.gridx = 0;
       // gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.ipadx = 1;
        gbc.ipady = 1;

        this.add(new JButton("<html><h1>Ola! <i>mundo</i><br></h1></html>"),gbc); // ocula exata uma celula

        this.add(new JButton("Segundo!"),gbc); // tambem ocula uma celula

        gbc.gridwidth = GridBagConstraints.REMAINDER;

        this.add(new JButton("Terceiro!"),gbc); // ocula uma celular e é a ultima

        gbc.gridwidth = 2;

        this.add(new JButton("Quarto!"),gbc); // ocula uma celular e é a ultima       this.add(new JButton("Quarto!"),gbc); // ocula duas celulas na horizontal

        gbc.gridwidth = GridBagConstraints.REMAINDER;

        this.add(new JButton("Quinto!"),gbc); // ocula uma celular e é a ultima       this.add(new JButton("Quarto!"),gbc); // ocula duas celulas na horizontal

        this.add(new JButton("<html><i>Learn!</i> <a href=\"#\">click here!</a></html>"));

    }


}
