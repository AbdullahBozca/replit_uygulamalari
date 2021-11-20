package replit_uygulamalari_scanner;

import java.util.Scanner;

public class Scanner_06 {

	public static void main(String[] args) {
		// Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
		
		System.out.println("Float bir değişken girin: ");
		Scanner scan=new Scanner(System.in);
		float a=scan.nextFloat();
		short b=(short) a;
		System.out.println(b);
		
		
	}

}
