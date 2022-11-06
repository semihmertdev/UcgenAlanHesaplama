import java.util.Scanner;

public class UcgenAlanHesaplama {
	public static void main(String[] args) {
		int kenarA, kenarB, kenarC, u, alan;
		
		
	Scanner input = new Scanner(System.in);
	System.out.print("A kenarının uzunluğunu giriniz: ");
	kenarA = input.nextInt();
	System.out.print("B kenarının uzunluğunu giriniz: ");
	kenarB = input.nextInt();
	System.out.print("C kenarının uzunluğunu giriniz: ");
	kenarC = input.nextInt();
	
	u = (kenarA + kenarB + kenarC) / 2;
	alan =(int) Math.sqrt(u * (u-kenarA) * (u-kenarB) * (u-kenarC));
	System.out.println("Üçgenin Alanı: " + alan);

	
	
	
		
		
	}

}