package replit_uygulamalari_list;

import java.util.ArrayList;

public class List_04 {

	public static void main(String[] args) {
		// Write a program that deletes the letters 'a' from the names in the list given
		// as input.

		// INPUT :
		// list1={"Ali","Veli","Ayse","Fatma","Omer"}

		// OUTPUT :

		// [Veli,Omer]
		String arr[] = { "Ali", "Veli", "Ayse", "Fatma", "Omer" };
		ArrayList<String> list = new ArrayList<String>();
		String silenecek="a";
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).equalsIgnoreCase(silenecek));
			if (list.get(i).equalsIgnoreCase	(silenecek)) {
				System.out.println(list.get(i));
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
	}

}
