import java.util.Locale;
import java.util.Scanner;

public class EntradaDados1 {
	
	public static void main(String[] args) {
		
//		Locale.setDefault(Locale.US);	//Defini o Locale para US para usar ponto como separador decimal, isso antes do Scanner.
		//Meu Sistema se encontra com o Locale do Brasil, separador decimal é virgula,entao nao preciso definir no programa.
		Scanner sc = new Scanner(System.in);
		
		double x;
		char z;
		System.out.println("Digite um número:");
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n",  x); //Formatacao do printf com duas casas decimais 2f - float, %n - quebra de linha.
		System.out.println("Digite um caractere:");
		z = sc.next().charAt(0); //Ler um char, usando next com detalhe para index 0 ou seja primeiro caractere da string.
		System.out.println("Você digitou: " + z);
		
		System.out.println("Digitar Nome, inteiro e Double: ");	//Ler vários dados na mesma linha, usando next() para ler a string sem espaços, nextInt() para ler o inteiro e nextDouble() para ler o double.
		String u;
		int v;
		double w;
		
		u = sc.next();
		v = sc.nextInt();
		w = sc.nextDouble();
		System.out.println("Dados Digitados: ");
		System.out.println(u);
		System.out.println(v);
		System.out.println(w);
		
		
		sc.close();
	}
}
