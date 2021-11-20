package replit_uygulamalari_loops;

import java.util.Iterator;
import java.util.Scanner;

public class For_while_ {

	public static void main(String[] args) {
		////Bir String icerisinde yinelenen karakterleri 
        //döndüren bir kod yazıniz.(mülakat Sorusu)
        //Input :
        //String str=“Javaisalsoeasy”
        //Output: a s
		/*
		String str = "Javaisalsoeasy";
        String bulunan="";
        System.out.print("Tekrar eden harfler :");
        
        for (int i = 0; i < str.length(); i++) {
		for (int j = i+1; j < str.length(); j++) {
			if (str.charAt(i)==str.charAt(j)) {
				
        if (str.contains(str.substring(i, i+1))) {
        	bulunan+=str.charAt(i);			
		}}
        
		}	
	}
        System.out.println(bulunan);
        
		*/
		Scanner scan = new Scanner(System.in);
	    String cümle = scan.nextLine();
	    String str = "";
	    
	     for (int i = 0; i < cümle.length(); i++) {
	       for (int j = i+1; j < cümle.length(); j++) {
	         if (cümle.charAt(i) == cümle.charAt(j)) 
	           if (!str.contains(cümle.substring(i,i+1))) {
	              str += cümle.charAt(i) + " ";
	             
	            }
	          }     
	      }
	 System.out.print(str);
		
	}

}
