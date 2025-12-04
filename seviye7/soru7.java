package seviye7;

public class soru7 {
    public static void main(String[] args) {
        /* Bir P asal sayı ise, p = a2 - b2 olacak biçimde 1 ila 10 aralığında bulunan 
a ve b tam sayılarını bulun.*/
        for (int a = 1; a <= 10; a++)
            for (int b = 1; b <= 10; b++) {
                int p = a * a - b * b, i = 2;
                if (p > 1) {
                    while (i <= Math.sqrt(p) && p % i != 0)
                    i++;
                    if (i > Math.sqrt(p))
                        System.out.println("P: " + p + " = " + a + "^2 - " + b + "^2");
                }
            }
    }
}