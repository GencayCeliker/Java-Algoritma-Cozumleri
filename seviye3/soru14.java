package seviye3;

import java.util.Scanner;

public class soru14 {
    public static void main(String[] args) {
        /*Girilen bir cümleyi aşağıdaki şekle uyarlayıp ekrana yazdırınız: Örn, 
        m r a a 
        e h b
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        for (int i = 0; i < kelime.length(); i += 2) {
            System.out.print(kelime.charAt(i) + "  ");
        }
        System.out.println();
        for (int i = 1; i < kelime.length(); i += 2) {
            System.out.print("  " + kelime.charAt(i));
        }

        scanner.close();
    }
}