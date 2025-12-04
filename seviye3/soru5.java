package seviye3;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        //Girilen bir cümleyi tersden yazdırınız ( merhaba -> abahrem )
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String yazi = scanner.nextLine();
        for (int i = yazi.length()-1; i >=0; i--) {
            System.out.print(yazi.charAt(i)); ;
        }
        scanner.close();
    }
}
