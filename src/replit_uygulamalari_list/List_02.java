package replit_uygulamalari_list;

import java.util.ArrayList;

public class List_02 {

	public static void main(String[] args) {
		// Create a 10-element list. Swap the 8th element with the 3rd element.

		// INPUT : String[]
		// names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		// Output:

		// [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]

		String arr[] = { "Umit","Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali" };
		ArrayList<String> names = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			names.add(arr[i]);
		}
		System.out.println(names);
		String yedek = names.get(2);

		names.set(2, arr[7]);
		names.set(7, yedek);
		System.out.println(names);

	}

}
