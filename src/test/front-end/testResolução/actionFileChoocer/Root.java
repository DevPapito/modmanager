import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;

import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Root extends JFrame implements ActionListener{

    private  JButton button;

    public Root() {

        super("Teste de file chooser");

        button = new JButton("Escolha o arquivo aqui!");
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(4);
        this.setLayout(new FlowLayout());
        this.pack();

        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button) {

            JFileChooser fileChooser = new JFileChooser();

            // Direciona para o folder
            fileChooser.setCurrentDirectory(new File("."));
            // Filtragem de opções
            FileNameExtensionFilter filter = new FileNameExtensionFilter("ARQUIVOS TXT e JAR","txt","jar");

            // Filtra pelas opções postas
            fileChooser.setFileFilter(filter);

            // Modo apenas para diretorios
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            fileChooser.setAcceptAllFileFilterUsed(false);

            int choose = fileChooser.showOpenDialog(null); // select file to open
            // 0 escolheu arquivo 1 vazio
            //String element = fileChooser.showOpenDialog(null); // select file to open
            if (choose < 1) {

                System.out.println(choose);
                System.out.println("Voce escolheu um arquivo");
                System.out.println(fileChooser.getSelectedFile());
                System.out.println(fileChooser.getSelectedFile().getAbsolutePath());
                // Aceita formato para File em IO/NIO
                // formato arquivo real
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);

            }

        }

    }

}
