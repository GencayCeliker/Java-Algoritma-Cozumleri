package Seviye2;

import java.util.Random;

public class soru11 {
    public static void main(String[] args) {
        /*   Ekrana 20 adet rastgele 10-20 arasında tamsayılar yazdırınız*/
        Random r=new Random();
        for(int k=1;k<=20;k++)
        {
            int n = r.nextInt(11) + 10;
            System.out.print(k+" rastgele 10-20 arasında tamsayılar: "+n+"\n");
        }
    }
}
