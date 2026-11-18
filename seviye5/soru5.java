package seviye5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class soru5 extends JFrame {
    /* Basit bir labirent oyunu programlamanız istenmektedir ve istenilen şartlar 
şunlardır: 
Ekranda 20 adet “.” (nokta) “yem” bulunması istenmektedir, bunun yanında, 
Ekranda 80 adet “x”(x) “engel” bulunması istenmektedir, bunun yanında, 
Ekranda 30 adet “m”(m) “mayın” bulunması istenmektedir, bunun yanında, 
Ekranda 1 adet “c”(c) “çıkış” noktası bulunması istenmektedir, bunun yanında, 
Ekranda 1 adet “o”(o) “oyuncu” noktası bulunması istenmektedir. 
“o” karakterini kullanıcı klavyenin OK(yön) tuşlarıyla serbestçe hareket ettirebilsin, 
tüm yemleri toplasın, 
engellerden sıçrayamasın,etrafından dolaşsın, 
mayına çarpmasın,çarparsa oyun sona ersin, 
c noktasına varsın, bitişe varılınca toplam puanı kullanıcıya söylesin.  
Belirtilmeyen diğer şartlar ve puanlama sistemi programcının hayal ürününe 
bırakılmıştır.  
şartlarını gerçekleştiren programı yazınız…*/

// !!! NOT:Bazı Kısımlarda Yapay Zekadan destek alınmıştır!!!
    private char[][] labirent = new char[15][30];
    private int[] oyuncu = new int[2];
    private int puan, yemSayisi;

    public soru5() {
        setTitle("Labirent Oyunu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Labirent oluştur: her öğe yalnızca boş bir hücreye yerleşir, böylece
        // oyuncu, çıkış ve yemler üst üste binip kaybolmaz (oyunda tam 20 yem olur)
        Random r = new Random();
        int[] p = bosHucre(r);
        oyuncu[0] = p[0];
        oyuncu[1] = p[1];
        labirent[oyuncu[0]][oyuncu[1]] = 'o';

        // Çıkış ekle
        yerlestir(r, 'c', 1);

        // Yem, engel ve mayınları ekle
        yerlestir(r, '.', 20);
        yerlestir(r, 'x', 80);
        yerlestir(r, 'm', 30);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
                // drawString yazının taban çizgisini kullanır: ilk satırın görünmesi için +15
                for (int i = 0; i < 15; i++)
                    for (int j = 0; j < 30; j++)
                        if (labirent[i][j] != '\0')
                            g.drawString(labirent[i][j] + "", j * 20 + 5, i * 20 + 15);
                g.drawString("Puan: " + puan + "  Yem: " + yemSayisi + "/20", 10, 15 * 20 + 22);
            }
        };
        panel.setPreferredSize(new Dimension(30 * 20, 15 * 20 + 32));
        add(panel);
        pack();
        setLocationRelativeTo(null);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int x = oyuncu[0], y = oyuncu[1], yeniX = x, yeniY = y;
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        yeniX--;
                        break;
                    case KeyEvent.VK_DOWN:
                        yeniX++;
                        break;
                    case KeyEvent.VK_LEFT:
                        yeniY--;
                        break;
                    case KeyEvent.VK_RIGHT:
                        yeniY++;
                        break;
                }

                if (yeniX >= 0 && yeniX < 15 && yeniY >= 0 && yeniY < 30) {
                    char h = labirent[yeniX][yeniY];
                    if (h == 'x')
                        return;
                    if (h == 'm') {
                        JOptionPane.showMessageDialog(null, "Mayına çarptın!");
                        System.exit(0);
                    }
                    if (h == 'c' && yemSayisi < 20) {
                        JOptionPane.showMessageDialog(null, "Önce tüm yemleri topla!");
                        return;
                    }
                    if (h == 'c') {
                        JOptionPane.showMessageDialog(null, "Tebrikler! Puan: " + puan);
                        System.exit(0);
                    }
                    if (h == '.') {
                        puan += 10;
                        yemSayisi++;
                    }

                    labirent[x][y] = ' ';
                    labirent[yeniX][yeniY] = 'o';
                    oyuncu[0] = yeniX;
                    oyuncu[1] = yeniY;
                    repaint();
                }
            }
        });

        setVisible(true);
    }

    // Rastgele bir boş hücre bulur
    private int[] bosHucre(Random r) {
        int i, j;
        do {
            i = r.nextInt(15);
            j = r.nextInt(30);
        } while (labirent[i][j] != '\0');
        return new int[] { i, j };
    }

    // Verilen karakteri adet kadar boş hücreye yerleştirir
    private void yerlestir(Random r, char c, int adet) {
        for (int k = 0; k < adet; k++) {
            int[] h = bosHucre(r);
            labirent[h[0]][h[1]] = c;
        }
    }

    public static void main(String[] args) {
        new soru5();
    }
}