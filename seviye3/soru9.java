package seviye3;
import java.util.Scanner;
public class soru9 {
    public static void main(String[] args) {
        /*Girilen bir cümleyi aşağıdaki şekle uyarlayıp ekrana yazdırınız: Örn, 
            m 
            me 
            mer 
            merh 
            merha 
            merhab 
            merhaba 
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String al = sc.nextLine();
        for (int i = 1; i <= al.length(); i++) {
            System.out.println(al.substring(0, i));
        }
        sc.close();
    }
}
