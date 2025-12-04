package seviye3;
import java.util.Scanner;
public class soru1 {
    public static void main(String[] args) {
        /* Girilen bir cümlenin kaç adet karakterden oluştuğunu söyleyiniz  */
        System.out.print("Bir Cümle Giriniz: ");
        Scanner oku=new Scanner(System.in);
        String cum;
        cum=oku.nextLine();
        System.out.println("Karakter Sayısı: "+cum.length());
        oku.close();
    }
}
