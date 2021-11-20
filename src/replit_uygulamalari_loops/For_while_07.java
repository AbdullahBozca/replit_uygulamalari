package replit_uygulamalari_loops;

import java.util.Scanner;

public class For_while_07 {

	public static void main(String[] args) {
		// Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		//Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, 
		//herhangi bir sayı Mükemmel Sayı olarak bilinir.
		Scanner scan=new Scanner(System.in);
		System.out.println("br sayı giriniz: ");
		int sayi=scan.nextInt();
		int toplam=0;
		for (int i = 1; i < sayi; i++) {
			if (sayi%i==0) {
				toplam+=i;
			}
		}
		if (sayi==toplam) {
			System.out.println(sayi+" Mukemmel Sayidir.");
		}else {
			System.out.println(sayi+" Mukemmel Sayidir degildir.");
		}
	}

}
