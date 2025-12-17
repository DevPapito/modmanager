package treinoMVC.desktop.view;

import treinoMVC.desktop.controller.RegisterController;
import treinoMVC.desktop.controller.UserController;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RootView extends JFrame implements ActionListener {

    private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    private RegisterController registerController;

    // LABELS ------------

    private JLabel labelUsername;
    private JLabel labelEmail;
    private JLabel labelPassword;

    private JLabel labelShowUsername;
    private JLabel labelShowEmail;
    private JLabel labelShowPassword;

    // Erro/Confirm

    public JLabel labelInfo;


    // -------------------

    // TEXTFIELDS --------

    private  JTextField textUsername;
    private  JTextField textEmail;
    // Colocar  TextPassword
    //private  JTextField textPassword;
    private JPasswordField textPassword;

    // -------------------

    // BUTTON ------------

    private JButton buttonApply;

    // --------------------

    public RootView() {

        super("Programa MVC Teste");

        // labels

        labelUsername = new JLabel("Escreva seu nome abaixo");
        labelUsername.setBounds(0,0,200,50);

        labelEmail = new JLabel("Escreva seu email abaixo");
        labelEmail.setBounds(0,100,200,50);

        labelPassword = new JLabel("Escreva sua senha abaixo");
        labelPassword.setBounds(0,200,200,50);

        // labels show

        labelShowUsername = new JLabel("");
        labelShowUsername.setBounds(0,400,200,50);

        labelShowEmail = new JLabel("");
        labelShowEmail.setBounds(0,450,200,50);

        labelShowPassword = new JLabel("");
        labelShowPassword.setBounds(0,500,200,50);

        // label info

        labelInfo = new JLabel("");
        labelInfo.setBounds(0,370,200,50);

        // TextField

        textUsername = new JTextField(20);
        textUsername.setBounds(0,50,200,50);

        textEmail = new JTextField(20);
        textEmail.setBounds(0,150,200,50);

        textPassword = new JPasswordField(20);
        textPassword.setEchoChar('*');
        textPassword.setBounds(0,250,200,50);

        // Button

        buttonApply = new JButton("<html><i>Register</i></html>");
        buttonApply.setBounds(0,320,200,50);
        buttonApply.addActionListener(this);

        this.setSize(screen.width,screen.height);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.gray);

        // Layout baseado em x e y position
        this.setLayout(null);

        // adds

        this.add(labelUsername);
        this.add(textUsername);
        this.add(labelEmail);
        this.add(textEmail);
        this.add(labelPassword);
        this.add(textPassword);
        this.add(labelInfo);

        // shows
        this.add(labelShowUsername);
        this.add(labelShowEmail);
        this.add(labelShowPassword);

        // Button
        this.add(buttonApply);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==this.buttonApply) {

            String name = this.textUsername.getText();
            String email = this.textEmail.getText();
            char[] password = this.textPassword.getPassword();

            String[] post = {name,email,new String(password)};

            // Visualização em escopo de front-end
            if (name.isEmpty() || email.isEmpty() || password.length == 0) {

                this.textUsername.setText("");
                this.textEmail.setText("");
                this.textPassword.setText("");
                this.labelInfo.setText("Campos não devem estar vazios!");

            }else {

                System.out.println("Eviado!");
                System.out.println(name+"\n"+email+"\n"+password);

                // Envio para o backend
                String[] get = this.registerController.applyRegister(post);

                this.labelShowUsername.setText(get[0]);
                this.labelShowEmail.setText(get[1]);
                this.labelShowPassword.setText(get[2]);

            }


        }

    }

    public void setRegisterController(RegisterController registerController) {

        this.registerController = registerController;

    }

}
