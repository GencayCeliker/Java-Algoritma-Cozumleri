package seviye3;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
        //Peşpeşe girilen 10 adet kelimeyi aralarına boşluk koyarak birleştirip 
        //cümle elde ediniz ve bu cümleyi ekrana yazdırınız
        Scanner scanner = new Scanner(System.in);
        StringBuilder cumle = new StringBuilder();
        System.out.println("10 adet kelime giriniz:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". kelime: ");
            String kelime = scanner.nextLine();
            cumle.append(kelime+" ");
        }
        System.out.println("Oluşturulan cümle: " + cumle.toString());
        scanner.close();
    }
}
