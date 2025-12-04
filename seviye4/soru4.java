package seviye4;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*3x3 lük bir matris açınız. Bu matrisin içini “0” larla doldurunuz. Kullanıcının 
seçeceği satır-sütuna göre aşağıdaki işlemi gerçekleştiriniz: (satır-sütun un 
kapsadığı yatay ve dikey karelere “1” rakamı yerleştirilmek isteniyor )  
   matris 
 0 0 0 
 0 0 0 
 0 0 0 
 
Satır seç? 2(enter) 
Sütun seç? 3(enter) 
 
   Dolgu Matris 
0 0 1 
1 1 1 
0 0 1 
  
şeklinde bir ekran çıktısı isteniyor… */
        int[][] m = new int[3][3]; // 3x3 matris
        Scanner s = new Scanner(System.in);

        System.out.print("Satır seç? (1-3): ");
        int r = s.nextInt() - 1; // Satır indeksi (0-2)
        System.out.print("Sütun seç? (1-3): ");
        int c = s.nextInt() - 1; // Sütun indeksi (0-2)

        System.out.println("\nDolgu Matris");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == r || j == c) {
                    m[i][j] = 1;
                    System.out.print( "1 ");
                } else {
                    m[i][j] = 0;
                    System.out.print( "0 ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}