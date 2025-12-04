package seviye4;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        /*3x3 lük bir matris açınız. Bu matrisin içine klavyeden kullanıcının gireceği 
sayıları yerleştiriniz. Her sütunun ve her satırın toplamını ekrana yazdırınız. Örn: 
 
 2 5 6  
 8 4 7  
 9 7 2  
 
1.satır toplam=13 ,  1.sütun toplamı=19 
2.satır toplam=19  ,  2.sütun toplamı=16 
3.satır toplam=18 ,  3.sütun toplamı=15 
 
 şeklinde çıktı istenmektedir.*/
        int[][] matris = new int[3][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matris[" + (i + 1) + "][" + (j + 1) + "]: ");
                matris[i][j] = s.nextInt();
            }
        }

        int satir1 = 0, sutun1 = 0, satir2 = 0, sutun2 = 0, satir3 = 0, sutun3 = 0;
        for (int i = 0; i < 3; i++) {
            satir1 += matris[i][0];
            satir2 += matris[i][1];
            satir3 += matris[i][2];
            sutun1 += matris[0][i];
            sutun2 += matris[1][i];
            sutun3 += matris[2][i];
        }
        System.out.print("1. Satır Toplamı:" + satir1 + "  1. Sutun Toplamı: " + sutun1 +"\n" +"2. Satır Toplamı:" + satir2 + "2. Sutun Toplamı: " + sutun2 + 
        "\n" + "3. Satır Toplamı:" + satir3 + "3. Sutun Toplamı:" + sutun3);
    }
}