import java.util.Locale;
import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatro números inteiros: ");
		System.out.print("Primeiro número: ");
		int n1 = sc.nextInt();
		System.out.print("Segundo número: ");
		int n2 = sc.nextInt();
		System.out.print("Terceiro número: ");
		int n3 = sc.nextInt();
		System.out.print("Quarto número: ");
		int n4 = sc.nextInt();
		
		int dif = (n1*n2 - n3*n4);
		
		System.out.print("A diferença entre os números digitados é " + dif);
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
