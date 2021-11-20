package replit_uygulamalari_scanner;

import java.util.Scanner;

public class Scanner_04 {

	public static void main(String[] args) {
		// Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. 
		//Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
		//1 şeker = 1.7 gr
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Günde kaç bardak çay içiyorsunuz: ");
		int bardak=scan.nextInt();
		System.out.println("Ne kada şeker kullanıyorusunuz: ");
		int seker=scan.nextInt();
		double yillıkSeker=((bardak*(seker*1.7))*365)/1000;
		System.out.println("Yılda "+yillıkSeker+" kg şeker kullanıyor.");
	}

}
