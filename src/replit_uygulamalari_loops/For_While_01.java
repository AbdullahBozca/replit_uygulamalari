package replit_uygulamalari_loops;

import java.util.Scanner;

public class For_While_01 {

	public static void main(String[] args) {
		// Kullanıcıdan bir isim ve bir karakter girmesini isteyin, 
		//ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir isim giriniz: ");
		String kelime=scan.nextLine();
		System.out.println("Aramak istediğiniz harfi giriniz: ");
		char aranacak=scan.next().charAt(0);
		int arama=0;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i)==aranacak) {
				arama++;
			}
		}
		System.out.println("Number of "+aranacak+" = "+arama);
		
	}

}
