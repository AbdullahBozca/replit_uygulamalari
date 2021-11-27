package replit_uygulamalari_loops;

import java.util.Scanner;

public class For_while_10 {

	public static void main(String[] args) {
		//Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

		//Input :

		//30

		//40

		//Beklenen Cikti:
		//Beklenen Cikti:
		//30 ve 40 icin GCD = 10

		//30 ve 40 icin LCM = 120
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Birinci sayi :");
		int sayi1=scan.nextInt();
		System.out.println("İkinci sayi :");
		int sayi2=scan.nextInt();
		int gcb=0;
		int lcm=1;
		for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
			if (sayi1%i==0 && sayi2%i==0) {
				gcb=i;
			}
		}
		lcm=gcb*(sayi1/gcb)*(sayi2/gcb);
		System.out.println(sayi1+" ve "+sayi2+" icin GCD = "+gcb);
		System.out.println(sayi1+" ve "+sayi2+" icin LCM = "+lcm);
		
			
	}

}
