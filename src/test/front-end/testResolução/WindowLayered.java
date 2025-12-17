import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class WindowLayered extends JFrame {
    private JLayeredPane layered;
    private JPanel root, center, right;

    private final Dimension MIN_SIZE = new Dimension(800, 600);

    public WindowLayered() {
        setTitle("Layered + BorderLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // tamanho inicial + mínimo
        setSize(1280, 720);
        setMinimumSize(MIN_SIZE);

        // opcional: abrir maximizada
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        layered = new JLayeredPane();
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(layered, BorderLayout.CENTER);

        root = new JPanel(new BorderLayout());
        root.setBackground(Color.GRAY);

        center = new JPanel();
        center.setBackground(Color.BLUE);

        right = new JPanel();
        right.setPreferredSize(new Dimension(300, 0));
        right.setBackground(Color.GREEN);

        root.add(center, BorderLayout.CENTER);
        root.add(right, BorderLayout.EAST);

        layered.add(root, Integer.valueOf(100));

        // garante que root sempre acompanhe o tamanho do layered
        layered.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // pega largura/altura atuais
                int w = Math.max(layered.getWidth(), MIN_SIZE.width);
                int h = Math.max(layered.getHeight(), MIN_SIZE.height);

                // aplica no root
                root.setBounds(0, 0, w, h);
                root.revalidate();

                // se a janela for menor que o mínimo, restaura
                if (getWidth() < MIN_SIZE.width || getHeight() < MIN_SIZE.height) {
                    setSize(Math.max(getWidth(), MIN_SIZE.width),
                            Math.max(getHeight(), MIN_SIZE.height));
                }
            }
        });

        // inicializa root ocupando a tela
        root.setBounds(0, 0, getWidth(), getHeight());

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WindowLayered::new);
    }
}

