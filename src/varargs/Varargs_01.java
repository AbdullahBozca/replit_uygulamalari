package varargs;

import java.util.Arrays;

public class Varargs_01 {

	public static void main(String[] args) {
		
		System.out.println((sum(1,2,3,4)));
	}

	private static int sum(int... sayilar) {
		// TODO Auto-generated method stub
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		return toplam;
	}

}
