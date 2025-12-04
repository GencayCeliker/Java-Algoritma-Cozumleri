package seviye3;
import java.util.*;
public class soru2 {
    public static void main(String[] args) {
      /* Girilen bir cümlenin soldan 10 karakterini ve sağdan 10 karakterini ekrana 
yazdırınız */

        Scanner a=new Scanner(System.in);
        System.out.println("Bir Cümle Giriniz");
        String cumle=a.nextLine();
        if (cumle.length()>=20){
              // Soldan 10 karakter alıyor Başlangıç Ve Bitiş İndeksi verdin Kullan
            String soldan10 = cumle.substring(0, 10);
              // Sağdan 10 karakter alıyor
            String sagdan10 = cumle.substring(cumle.length() - 10);
            System.out.println("Soldan 10 karakter: " + soldan10);
            System.out.println("Sağdan 10 karakter: " + sagdan10);
        } else{
             // Cümle 20 karakterden kısa ise uyarı mesajı veriliyor
            System.out.println("Girilen cümle 20 karakterden kısa.");
        }
        a.close();
    }
}
