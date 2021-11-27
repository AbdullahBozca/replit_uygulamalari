package replit_uygulamalari_if;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_08 {

	public static void main(String[] args) {
		// Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 
		//3 kopyasından oluşan yeni bir String yazdırın

		Scanner scan=new Scanner(System.in);
		String isim=scan.next();
		
		for (int i = 0; i < 3; i++) {
			System.out.print(isim.substring(isim.length()-2));
		}
	}

}
