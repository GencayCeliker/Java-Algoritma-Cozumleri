package Seviye2;

public class soru15 {
    public static void main(String[] args) {
        /* a+b=c şartı verilmiş olsun. istenilen koşullar şunlardır: 
        a ve b sayısı 100 den küçüktür, 
        a sayısı b den büyüktür. 
        b sayısının karesi 1000 den küçüktür 
        c nin karekökü 850 den küçüktür. 
        Bu şartları sağlayan a ve b değerlerini bulan ve ekrana yazdıran programı 
        yazınız.*/
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b <100; b++) {
                int c = a + b;
                if (a > b && b * b < 1000 && Math.sqrt(c) < 850) {
                    System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                }
            }
        }
    }
}
