package seviye7;

public class Soru10 {
    public static void main(String[] args) {
        /* abcde kişileri yuvarlak bir masa etrafında kendi aralarında yer 
değiştirecek şekilde kaç türlü şekilde oturabileceğini ekrana çıktı olarak 
belirtiniz.*/
        int n = 5;
        int sonuc = 1;
        for (int i = 2; i < n; i++)
            sonuc *= i;
        System.out.println("Yuvarlak masa etrafında oturma sayısı: " + sonuc);
    }
}
