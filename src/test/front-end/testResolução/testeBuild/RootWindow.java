import javax.swing.JFrame;
import javax.swing.ImageIcon; // Classe que permite transformar icon em imagem

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class RootWindow extends JFrame {

    // Configuração da janela direto do construtor
    public RootWindow() {

        ImageIcon icon = new ImageIcon("caminho da imagem");

        // Herdados da JFrame logo turo que esta na root raiz sera this

        // Basico

        this.setTitle("Teste01 estrutura base");
        this.setVisible(true);

        // configuração de localização SEM ORGANIZADORES DE PAGINA

        this.setSize(435,540);
        this.setResizable(false);
        this.setLayout(null); // Sem configuração base de layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cor de fundo

        // cor pode ser em hex ou RGB
        this.getContentPane().setBackground(new Color(0xFFFF));

        // logo
        this.setIconImage(icon.getImage());

        // Metodo de organização centralizada da janela
        this.centralize();

    }

    public void centralize() {

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        this.setLocation((tela.width - this.getSize().width)/2,
                (tela.height - this.getSize().height)/2);

    }

}
