import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o número do raio do círculo: ");
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		double area = pi * (raio*raio);
		
		System.out.printf("A area do círculo é %.4f%n", area);
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
