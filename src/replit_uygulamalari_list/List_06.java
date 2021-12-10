package replit_uygulamalari_list;

import java.util.ArrayList;
import java.util.Arrays;

public class List_06 {

	public static void main(String[] args) {
		// Write a program to find the common elements between two String Arrays (without case sensitivity)

		//Input1 : {John,Brad,Ange,Sofia,Emily}

		//Input2 : {sofia,brad,grace,emily,hazel}

		//Output : [sofia,brad,emily]

		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("John","Brad","Ange","Sofia","Emily"));
		ArrayList<String> list2=new ArrayList<String>(Arrays.asList("sofia","brad","grace","emily","hazel"));
		ArrayList<String> eslesenList=new ArrayList<String>();
		for (String each : list1) {
			for (String each2: list2) {
				if (each.equalsIgnoreCase(each2)) {
					eslesenList.add(each2);
				}
			}
			
		}
		System.out.println(eslesenList);
	}

}
