import java.util.Locale;
import java.util.Scanner;

void main() {
//	Locale.setDefault(Locale.of("pt","BR")); //Definir o Locale para Brasil, para usar a vírgula como separador decimal
	Locale.setDefault(Locale.US); 
	Scanner sc = new Scanner(System.in); //Scanner é Classe que permite ler dados do teclado, sc será nome do Objeto que será 
	//atribuido "new" operador Criacao/Instanciação do Objeto, segundo "Scanner" será construtor da Classe passando parametro System.in
//	System.out.print("Entre com seu Nome: ");
//	String name = sc.nextLine();
//	System.out.print("Entre com sua Idade: ");
//	int age = sc.nextInt();
//	System.out.println("Seu Nome: " + name + " e sua Idade: " + age);
	
//	double x;
//	IO.print("Entre com um valor: ");
//	x = sc.nextDouble();
//	IO.print(String.format("Valor de %.2f%n", x));
//	char x;
//	IO.print("Entre com um caractere: ");
//	x = sc.next().charAt(0); //next lê entrada com funcao charAt(0) em programação primeiro indice do Array começa com 0,ou primeiro caracter aqui.
//	IO.print("Valor de " + x);
	String x;
	int y;
	double z;
	IO.print("Entre com um valor String, int e double: "); //Ler dados numa unica linha, separados por espaço, exemplo: "Hello 123 45.67"
	x = sc.next();
	y = sc.nextInt();
	z = sc.nextDouble();
	IO.println("Voce digitou: ");
	IO.println(x);
	IO.println(y);
	IO.println(z);
	sc.close();
}