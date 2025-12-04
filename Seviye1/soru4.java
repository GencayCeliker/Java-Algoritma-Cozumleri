import java.util.Scanner;
public class soru4 {
        /*
		 * Peşpeşe girilen 20 sayının karelerini ve kareköklerini söyleyen programı 
           yazınız
		 */
    public static void main(String[] args) {   
        Scanner a=new Scanner(System.in);
        for ( int k=1;k<=20;k++) {
            System.out.print(k+". Sayıyı Giriniz: ");
            int  kare=a.nextInt();
            System.out.println("Girilen Sayının Karesi: "+kare*kare);
        System.out.print("Girilen Sayının Kare Kökü: "+Math.sqrt(kare)+"\n");
        }a.close();
    }
}
