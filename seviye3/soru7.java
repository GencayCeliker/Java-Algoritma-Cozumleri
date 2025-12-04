package seviye3;
import java.util.Scanner;
public class soru7 {
    public static void main(String[] args) {
/*  Girilen bir cümleyi aşağıdaki şekle uyarlayıp ekrana yazdırınız: Örn, 
m 
e 
r 
h 
a 
b 
a*/

    Scanner sc = new Scanner(System.in);
    System.out.print("Bir cümle giriniz: ");
    String yazi = sc.nextLine();
    for (int a = 0; a < yazi.length(); a++) {
        System.out.println(yazi.charAt(a));
    }

    sc.close();
    }
}
