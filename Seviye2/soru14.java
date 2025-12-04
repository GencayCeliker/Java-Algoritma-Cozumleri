package Seviye2;

public class soru14 {
    public static void main(String[] args) {
        /*  Fibonacci teoremini ekrana yazdırınız. ( Fibonacci teoremi şudur: 0-1-1
        2-3-5-8-13-21-34-55… şeklinde gider. Bir önceki sayı ile o andaki sayının 
        toplamı serisidir. 0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8, 5+8=13, 
        8+13=21 …  )  */
        int f1=0,f2=1;
        System.out.print(f1+" "+f2+" ");
        for (int k = 3; k <=20;k++) {
            int f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}
