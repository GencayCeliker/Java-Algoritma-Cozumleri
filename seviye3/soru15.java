package seviye3;

import java.util.Scanner;

public class soru15 {
    public static void main(String[] args) {
        /*Klavyeden girilen bir kelimenin “sayı” mı yoksa “string” ifade mi olduğunu 
söyleyen programı yazınız  */

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String al = sc.nextLine();
        sc.close();
        if (al.matches("\\d+")) {
            System.out.println("Girilen kelime bir sayı içeriyor.");
        } else {
            System.out.println("Girilen kelime bir string ifadedir.");
        }
    }
}