import java.util.Locale;
import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números para se obter a soma: ");
		System.out.print("Primeiro número: ");
		int n1 = sc.nextInt();
		System.out.print("Segundo número: ");
		int n2 = sc.nextInt();
		
		int sum = n1+n2;
		
		System.out.print("O resultado da soma entre os números é " + sum);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		

	}

}
