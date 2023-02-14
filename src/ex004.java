import java.util.Locale;
import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu número de identificação, horas trabalhadas e o valor de sua hora: ");
		
		System.out.print("\nNúmero de identificação: ");
		int ni = sc.nextInt();
		System.out.print("Horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.print("Valor da sua hora: ");
		double val = sc.nextDouble();
		double salario = horas*val;
		
		System.out.print("\nNúmero de identificação: " + ni);
		System.out.printf("\nSalário: R$ %.2f%n", salario);
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		

	}

}
