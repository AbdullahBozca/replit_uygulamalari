package replit_uygulamalari_scanner;

import java.util.Scanner;

public class Scanner_10 {

	public static void main(String[] args) {
		// Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek 
		//için bir Java programı yazın.
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		int gun=24*60;	
		int yil=a/(gun*365);//3456789-(yil*)
		int gunn=(a-((gun*365)*yil))/gun;
		
		System.out.println(a+" dakika yaklasik "+yil+" yil "+gunn+" gundur");
		
	}

}
