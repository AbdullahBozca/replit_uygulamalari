package replit_uygulamalari_if;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_03 {

	public static void main(String[] args) {
		// Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan
		// ve yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan
		// fazla basamakli olursa, "OverFlow" yazdırın.

		// Ornek:

		// INPUT :

		// 25

		// 46

		// OUTPUT :

		// Numaralarin Toplami:

		// 71

		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz: ");
		double sayi1 = scan.nextDouble();
		if (sayi1 < 0 || sayi1 >= 1000000000) {
			System.out.println("OverFlow");
			return;
		}
		System.out.println("İkinci sayiyi giriniz: ");
		double sayi2 = scan.nextDouble();
		if (sayi2 < 0 || sayi2 >= 1000000000) {
			System.out.println("OverFlow");
			return;
		}
		double toplam = sayi1 + sayi2;
		if (toplam >= 1000000000) {
			System.out.println("OverFlow");
			return;
		} else
			System.out.println("Numaralarin Toplami:" + toplam);
		scan.close();
	}

}
