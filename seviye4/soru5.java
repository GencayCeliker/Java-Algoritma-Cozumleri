package seviye4;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        /* 10 kişilik bir sınıf listesi oluşturunuz. Bu sınıf listesinde “adı-soyadı” “vize 
notu” “final notu” bilgileri bulunmaktadır. Bu bilgileri kullanıcı klavyeden 
girecektir. Bu listedeki her öğrenci için ders geçme notunu hesaplayınız ve bu 
notları ekrana tablo halinde yazdırınız. Kaç öğrencinin geçtiğini, kaç öğrencinin 
kaldığını söyleyiniz.  
 
Ders geçme notu şu şekilde hesaplanmaktadır: 
Ders_geçme_notu= vize_notu * 0.3 + final_notu * 0.7  
Eğer ders_geçme_notu >=50 ise öğrenci dersi geçmiştir, aksi halde kalmıştır.  
Eğer öğrencinin final notu <50 ise bu öğrenci direkt olarak kalmıştır. 
Yukardaki şartları göz önünde bulunduracak şekilde bir program yazınız.  
Örn: 
1. öğrencinin adı-soyadını giriniz: Hüsamettin Elalmış (enter) 
Hüsamettin Elalmış’ın vize notunu giriniz: 45 (enter) 
Hüsamettin Elalmış’ın final notunu giriniz: 70 (enter) 
2. öğrencinin adı-soyadını giriniz: Bill Gates (enter) 
Bill Gates’in vize notunu giriniz: 90 (enter) 
Bill Gates’in final notunu giriniz: 48 (enter) 
… 
Sonuç Listesi: 
Adı Soyadı  
Hüsamettin Elalmış 
Vize Notu 
45  
Final Notu 
70  
Ortalama 
Durum 
52,5 = 53 Geçti 
Bill Gates  
… 
90  
48  
şeklinde bir ekran çıktısı istenmektedir…
*/
        Scanner s = new Scanner(System.in);
        String[] ad = new String[10];
        int[] vize = new int[10];
        int[] finalNot = new int[10];
        double[] ortalama = new double[10];
        int gecen = 0, kalan = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ". Öğrenci Adı: ");
            ad[i] = s.nextLine();
            System.out.print("Vize Notu: ");
            vize[i] = s.nextInt();
            System.out.print("Final Notu: ");
            finalNot[i] = s.nextInt();
            s.nextLine();
            if (vize[i] < 50) {
                ortalama[i] = vize[i] * 0.3 + finalNot[i] * 0.7;
            }
            if (finalNot[i] < 50 || ortalama[i] < 50) {
                kalan++;
            } else {
                gecen++;
            }
        }

        System.out.println("\nAdı Soyadı\tVize\tFinal\tOrtalama\tDurum");
        for (int i = 0; i < 3; i++) {
            System.out.print(ad[i] + "\t" + vize[i] + "\t" + finalNot[i] + "\t"+ortalama[i]+"\t\t");
            if (finalNot[i] < 50 || ortalama[i] < 50) {
                System.out.print("\t\tKaldı");
            } else {
                System.out.print("\t\tGeçti"+"\n");
            }
        }

        System.out.println("\nGeçen öğrenci: " + gecen);
        System.out.println("Kalan öğrenci: " + kalan);
        s.close();
    }
}