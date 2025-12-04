import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {

/*Peşpeşe girilen 20 sayıdan “en küçük” ve “en büyük” sayıyı söyleyen programı yazınız. */
		Scanner giris= new Scanner(System.in);
		System.out.print("1. Sayı Giriniz:");
		int N=giris.nextInt();
		int EB=N, EK=N;
		for (int k=2;k<20;k++) 
		{
			System.out.print(k+". Sayıyı Giriniz:");
			N=giris.nextInt();
			if (N >EB)
			{
				EB=N;
			}
			else if(N<EK) 
			{
				EK=N;
			}
	}System.out.println("Girdiğiniz Sayının EN Büyüğü"+EB);
	System.out.println("Girdiğiniz Sayının EN KÜÇÜĞÜ"+EK);
	giris.close();
    }
}