package seviye5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class soru4 extends JFrame implements KeyListener {
    //Ekranın herhangi bir koordinatına “X” karakterini bastırın. Kullanıcı, OK 
//tuşlarıyla (Yön tuşları- Yukarı,Aşağı,Sola,Sağa) bu “X” karakterini ekranda 
//serbestçe istediği yöne hareket ettirebilsin. Her tuş basımında “X” karaktersi 
//istenilen yöne doğru 1 birim hareket etsin. Bu programı yazınız. 
    private int x = 100;
    private int y = 100;

    public soru4() {
        setTitle("X Karakteri Hareket Ettirme");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("X", x, y);
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
        SwingUtilities.invokeLater(soru4::new);
    }
}