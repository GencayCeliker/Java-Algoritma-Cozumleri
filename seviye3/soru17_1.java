package seviye3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class soru17_1 extends JPanel implements ActionListener {
    private static final int PANEL_WIDTH = 800;
    private static final int PANEL_HEIGHT = 600;
    private static final int DELAY = 20; // Hareket hızı (milisaniye)

    private String kelime = "MERHABA";
    private int x = 0, y = 50; // Başlangıç konumu
    private int stepX = 2, stepY = 0; // Hareket yönü (sağa başlar)
    private int direction = 0; // 0: sağa, 1: aşağı, 2: sola, 3: yukarı
    private Timer timer;

    public soru17_1() {
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.RED);
        g.drawString(kelime, x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Hareket algoritması
        if (direction == 0) { // Sağa hareket
            x += stepX;
            if (x + kelime.length() * 20 > PANEL_WIDTH) {
                direction = 1; // Aşağı gitmeye başla
                stepX = 0;
                stepY = 2;
            }
        } else if (direction == 1) { // Aşağı hareket
            y += stepY;
            if (y + 30 > PANEL_HEIGHT) {
                direction = 2; // Sola gitmeye başla
                stepX = -2;
                stepY = 0;
            }
        } else if (direction == 2) { // Sola hareket
            x += stepX;
            if (x < 0) {
                direction = 3; // Yukarı gitmeye başla
                stepX = 0;
                stepY = -2;
            }
        } else if (direction == 3) { // Yukarı hareket
            y += stepY;
            if (y < 50) {
                direction = 0; // Tekrar sağa gitmeye başla
                stepX = 2;
                stepY = 0;
            }
        }

        repaint(); // Ekranı tekrar çiz
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kayan Yazı Animasyonu");
        soru17_1 panel = new soru17_1();

        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Ortada aç
        frame.setVisible(true);
    }
}