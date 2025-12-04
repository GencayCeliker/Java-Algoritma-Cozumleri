package seviye5;

import javax.swing.*;
import java.awt.event.*;

public class soru1 extends JFrame {
    public static void main(String[] args) {
        /*Kullanıcı herhangi bir tuşa basıncaya kadar program beklesin. Kullanıcının 
bastığı tuşun ne olduğu ekrana ASCII koduyla beraber yazdıran ve sürekli bu 
işlemi tekrarlayan, ESC tuşuna basıldığında programı sonlandıran programı 
yazınız. */
        JFrame f = new JFrame("Tuş Takip (ESC=Çıkış)");
        JLabel l = new JLabel("Bir tuşa basın", JLabel.CENTER);
        f.add(l);
        f.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                l.setText("Basılan Tuş: " + (e.getKeyChar() == KeyEvent.CHAR_UNDEFINED ? "[Özel]" : KeyEvent.getKeyText(e.getKeyCode())) +
                        "   "+"ASCII Kodu: " + e.getKeyCode());
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
                    System.exit(0);
            }
        });
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}