package seviye3;
import java.util.*;
public class soru4 {
    public static void main(String[] args) {
        //Girilen bir cümlede kaç adet kelime olduğunu söyleyiniz
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String yazi = sc.nextLine();
        System.out.println(yazi.length());
        sc.close();
    }
}
