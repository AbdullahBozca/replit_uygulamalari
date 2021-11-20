package replit_uygulamalari_loops;

import java.util.Iterator;

public class For_while_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi=6;
		int faktoriyel=1;
		String sayilar="";
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
			sayilar+=i;
		}
		System.out.println(sayi+"!"+"="+sayilar+"="+faktoriyel);
		System.out.println(faktoriyel);
		System.out.println(sayilar);
	}

}
