import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {

		/*
		 * Peşpeşe girilen 20 sayıdan kaç tanesinin “30”dan küçük olduğunu söyleyen
		 * programı yazınız
		 */
		Scanner giris = new Scanner(System.in);
		int N;
		int say = 0;
		for (int k = 1; k <= 20; k++) {
			System.out.print(k + ". Sayıyı Giriniz:");
			N = giris.nextInt();
			if (N < 30)

				say = say + 1;

		}
		System.out.println("30 dan Küçük Sayılar: " + say + " Kadar.");
		giris.close();
	}

}
