package seviye4;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /* 3x3 lük 2 adet matris açınız. Bu matrislerin içini kullanıcının dolduracağı 
şekilde sayılar isteyiniz. Ekrana bu 2 matrisin toplamını yazdırınız. Örn: 
     
    1. matris       2. matris   Toplam Matris 
 1 2 5  7 8 2 8 10 7 
 5 8 3  9 2 1 14 10 4 
 4 5 9  2 8 4 6 13 13*/

        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[3][3], m2 = new int[3][3], t = new int[3][3];

        System.out.println("1. Matris (3x3):");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("2. Matris (3x3):");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++)
                t[i][j] = m1[i][j] + (m2[i][j] = sc.nextInt());{
            }
        }
        System.out.println("\n1.Matris\t2.Matris\tToplam");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(m1[i][j] + " ");
            System.out.print("\t");
            for (int j = 0; j < 3; j++)
                System.out.print(m2[i][j] + " ");
            System.out.print("\t");
            for (int j = 0; j < 3; j++)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }
    }
}