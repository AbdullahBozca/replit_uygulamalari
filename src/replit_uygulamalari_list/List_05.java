package replit_uygulamalari_list;

import java.util.ArrayList;
import java.util.Scanner;

public class List_05 {

	public static void main(String[] args) {
		// Write a program that accepts an integer as input and prints first
		// 10 prime numbers greater than input Check numbers if they are even
		// or not in a return method.

		// Input : 5

		// Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		
		int asal=0;
		int sayi=5;
		int bolum=0;
		ArrayList<Integer> asalSayilar=new ArrayList<Integer>();
		while (asal!=10) {
			for (int i = 5; i < 100; i++) {
				for (int j = 1; j < 100; j++) {
					if (i%j==0) {
					bolum++;
					
				}
				}
				
				if (bolum==2) {
					
					asal++;
					asalSayilar.add(i);
				}
			}
		}
		System.out.println(asalSayilar);
		
		
		
	}

}
