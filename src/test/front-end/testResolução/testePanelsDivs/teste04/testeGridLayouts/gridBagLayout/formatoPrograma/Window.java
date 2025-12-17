import javax.swing.JFrame;

class Window extends JFrame {

    private RootPanel rootPanel;

    public Window() {

        super("Window Formate GridBag");

        rootPanel = new RootPanel();
        rootPanel.setWindow(this.getSize().width,this.getSize().height);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(440,560);
        this.setResizable(true);
        this.setContentPane(rootPanel);

    }

}
