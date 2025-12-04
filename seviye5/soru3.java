package seviye5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class soru3 extends JFrame implements KeyListener {
// Ekranın herhangi bir koordinatına 4 mısradan oluşan herhangi bir şiir 
//yazınız. Bu şiiri kullanıcı, OK(yön) tuşlarıyla istediği yönlere doğru serbestçe 
//hareket ettirebilsin.  


    private int x = 100;
    private int y = 100;
    private final String[] siir = {
        "Birinci mısra",
        "İkinci mısra",
        "Üçüncü mısra",
        "Dördüncü mısra"
    };

    public soru3() {
        setTitle("Şiir Hareket Ettirme");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        for (int i = 0; i < siir.length; i++) {
            g.drawString(siir[i], x, y + i * 30);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                y -= 10;
                break;
            case KeyEvent.VK_DOWN:
                y += 10;
                break;
            case KeyEvent.VK_LEFT:
                x -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Gerekli değil
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Gerekli değil
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(soru3::new);
    }
}