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
        setSize(600, 300);

        // Labirent oluştur
        Random r = new Random();
        oyuncu[0] = r.nextInt(15);
        oyuncu[1] = r.nextInt(30);
        labirent[oyuncu[0]][oyuncu[1]] = 'o';

        // Çıkış ekle
        labirent[r.nextInt(15)][r.nextInt(30)] = 'c';

        // Yem, engel ve mayınları ekle
        for (int i = 0; i < 20; i++)
            labirent[r.nextInt(15)][r.nextInt(30)] = '.';
        for (int i = 0; i < 80; i++)
            labirent[r.nextInt(15)][r.nextInt(30)] = 'x';
        for (int i = 0; i < 30; i++)
            labirent[r.nextInt(15)][r.nextInt(30)] = 'm';

        add(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < 15; i++)
                    for (int j = 0; j < 30; j++)
                        g.drawString(labirent[i][j] + "", j * 20, i * 20);
                g.drawString("Puan: " + puan + " Yem: " + yemSayisi + "/20", 10, 290);
            }
        });

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

    public static void main(String[] args) {
        new soru5();
    }
}