package replit_uygulamalari_if;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods_01 {

	public static void main(String[] args) {
		// Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
		// program yazın (BMI)

		// IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

		// BMI 18,5'in altındaysa zayıfsınız

		// BMI 18,5 ile 25 arasında ise kilonuz idealdir

		// BMI 25-30 arasındaysa şişmansınız

		// BMI 30'dan büyük veya eşitse, obez

		Scanner scan = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz: ");
		double kilo = scan.nextDouble();

		System.out.println("Boyunuzu giriniz(cm): ");
		double boy = scan.nextDouble() / 100;

		double bmi = kilo / (boy * boy);
		if (bmi < 18.5) {
			System.out.println("Agirlik : " + kilo);
			System.out.println("Boy : " + boy);
			System.out.println("BMI : " + bmi);
			System.out.println("Zayifsiniz.");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Agirlik : " + kilo);
			System.out.println("Boy : " + boy);
			System.out.println("BMI : " + bmi);
			System.out.println("Kilonuz ideal.");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Agirlik : " + kilo);
			System.out.println("Boy : " + boy);
			System.out.println("BMI : " + bmi);
			System.out.println("Sismansiniz.");
		} else {
			System.out.println("Agirlik : " + kilo);
			System.out.println("Boy : " + boy);
			System.out.println("BMI : " + bmi);
			System.out.println("Obezsiniz.");

		}
		scan.close();
	}

}
