import javax.swing.JFrame;

class Window extends JFrame{

    public Window() {

        super("Window main");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new GridTeste());

        this.pack();

    }

}
