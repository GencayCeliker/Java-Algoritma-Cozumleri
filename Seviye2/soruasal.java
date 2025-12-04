package Seviye2;
import java.util.Scanner;;
public class soruasal{
    public static void main(String[] args) {
        int N;
		Scanner giris = new Scanner(System.in);
		System.out.print("Bir Sayıyı Giriniz: ");
		N = giris.nextInt();
		if(N < 3)
		{
			System.out.print("2 den büyük sayı giriniz: ");
			N = giris.nextInt();
		}
		int S = 0;
		for(int D = 2; D <= N-1;D++)
		{
			if(N % D == 0)
			{
				S++;
			}
		}
		if(S > 0)
		{
			System.out.print(N + " Asal sayı değil");
		}
		else
		{
			System.out.print(N + " Asal sayı");
		}

        giris.close();
    }  
}