import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        /*
		 * Peşpeşe girilen 20 sayının toplamını ve aritmetik ortalamasını söyleyen 
           programı yazınız 
		 */
        int top = 0;

        Scanner a = new Scanner(System.in);
        for (int k = 1; k < 21; k++) {
            System.out.print(k + ". Sayıyı Giriniz: ");
            int n = a.nextInt();
            top = top + n;
        }
        a.close();
        int ort = top / 20;
        System.out.println("Girilen Sayıların Toplamı" + top);
        System.out.println("Girilen Sayıların Ortalaması" + ort);

    }

}
