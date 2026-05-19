/* Switch Case uma estrutura de Controle de Fluxo, executa diferentes blocos de código com base no valor esperado de uma expressão.
 * Com isso ganha velocidade,diferente do if/else Statement que testa um a um argumento num fluxo de controle,se for ultimo entao testa todas as anteriores. 
 *  
 *  Statement if/else é focado em condições Booleanas comparativas, onde nao temos um valor específico a ser comparado, mas sim uma condição que pode ser verdadeira ou falsa.
 * 
 * - if/else: Domina quando a lógica exige operadores como >, <, && ou ||.
 * - switch-case: Ganha em velocidade, deixa o código muito mais legível e limpo,
 *  eliminando o cansaço visual de ler múltiplos blocos de código repetitivos.
 */
import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o dia da Semana de 1 a 7: ");
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido!";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}
