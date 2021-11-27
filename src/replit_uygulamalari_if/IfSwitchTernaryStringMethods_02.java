package replit_uygulamalari_if;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_02 {

	public static void main(String[] args) {
		// Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen 
		//formata ceviren java kodunu yaziniz.

		//Input :

		//John White

		//1234234534561478

		//Output : Name :

		//J* W**

		//CCN : ** ** **** 1478

		//Ilk Harfler Buyuk harf ile baslamalidir.
		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi giriniz: ");
		String ad=scan.next().toUpperCase();
		System.out.println("Soyadinizi giriniz: ");
		String soyAd=scan.next().toUpperCase();
		System.out.println("Kredi kartı numaranızı 16 hane halinde arada boşluk olmadan giriniz: ");
		String kkNo=scan.next();
		
		System.out.println("Name :"+ad.charAt(0)+"* "+soyAd.charAt(0)+"**");
		System.out.println("CCN : ** ** **** "+kkNo.substring(kkNo.length()-4));
		scan.close();
	}

}
