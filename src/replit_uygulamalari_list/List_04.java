package replit_uygulamalari_list;

import java.util.ArrayList;
import java.util.Arrays;

public class List_04 {

	public static void main(String[] args) {
		// Write a program that deletes the letters 'a' from the names in the list given
		// as input.

		// INPUT :
		// list1={"Ali","Veli","Ayse","Fatma","Omer"}

		// OUTPUT :

		// [Veli,Omer]
		ArrayList<String> listIsimler=new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
    	ArrayList<String> list2=new ArrayList<String>();
    	System.out.println(listIsimler);
    	for (String a: listIsimler) {
			if (!a.toLowerCase().contains("a")) {
				list2.add(a);
			}
		}
    	System.out.println(list2);
	}

}
