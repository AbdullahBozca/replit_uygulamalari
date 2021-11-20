package replit_uygulamalari_loops;

public class For_while_02 {

	public static void main(String[] args) {
		// 1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
		int a=0;
		int i=0;
		while (i<=100) {
			a+=i;
			i++;
		}
		System.out.println("Sayilarin Toplami : "+a);
	}

}
