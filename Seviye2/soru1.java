package Seviye2;
public class soru1 {

    public static void main(String[] args) {
        /*
		 * 1 den 100 e kadar olan sayıların karelerini ve kareköklerini ekrana 
           yazdırınız.
		 */
        for (int i=1;i<=100;i++)
        {
            System.out.println(i+" .Sayını Karesi: "+(i*i*Math.sqrt(i))+"\n");
            System.out.println(i+" .Sayının Karekökü: "+Math.sqrt(i));
        }

    }
}
