package seviye3;
import java.util.Scanner;
public class soru12 {
    public static void main(String[] args) {
/*Girilen bir cümleyi aşağıdaki şekle uyarlayıp ekrana yazdırınız: Örn, 
m-1- 
m-1-e-2- 
m-1-e-2-r-3- 
m-1-e-2-r-3-h-4- 
m-1-e-2-r-3-h-4-a-5- 
m-1-e-2-r-3-h-4-a-5-b-6- 
m-1-e-2-r-3-h-4-a-5-b-6-a-7- */

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String yazi = sc.nextLine();
        for (int a = 0; a < yazi.length(); a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print(yazi.charAt(b) + "-" + (b + 1) + "-");
            }
            System.out.println();
        }
        sc.close();
    }
}
