package seviye4;

public class soru3 {
    public static void main(String[] args) {
        /*3x3 lük bir matris açınız. Ekrana bu matrisin satırları ile sütunlarını yer 
değiştirerek yazdırınız.  
 
    1. matris      Sonuç Matris  
 1 2 5  1 5 4 
 5 8 3  2 8 5  
 4 5 9  5 3 9*/

        int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("1.Matris\tSonuç Matris");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(m[i][j] + " ");
            System.out.print("\t");
            for (int j = 0; j < 3; j++)
                System.out.print(m[j][i] + " ");
            System.out.println();
        }
    }
}