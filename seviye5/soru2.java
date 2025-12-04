package seviye5;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class soru2 extends JFrame implements KeyListener {
    private JTextArea textArea;
/*Klavyeden basılan her karakteri (rakamlar ve harfler) ekrana yan yana 
yazan bir daktilo programı yazınız. (Enter tuşu yazı yazarken bir alt satıra 
geçsin. Silme tuşu istenmiyor.. )  */

//NOT: !!!###Bu soruda öğrenim amaçlı Yapay zeka kullanılmıştır.!!!###
    public soru2() {
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.addKeyListener(this);

        add(new JScrollPane(textArea));
        setTitle("Daktilo Programı");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        if (Character.isLetterOrDigit(keyChar) || keyChar == ' ' || keyChar == '\n') {
            textArea.append(String.valueOf(keyChar));
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Gerekli değil
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Gerekli değil
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(soru2::new);
    }
}