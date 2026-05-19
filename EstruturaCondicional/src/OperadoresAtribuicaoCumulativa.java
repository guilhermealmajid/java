/* Aula 45 continuacao 
 *
 * /*
 * =======================================================================
 * Operadores de atribuição cumulativa
 * =======================================================================
 * +------------+------------+
 * | a += b;    | a = a + b; |
 * +------------+------------+
 * | a -= b;    | a = a - b; |
 * +------------+------------+
 * | a *= b;    | a = a * b; |
 * +------------+------------+
 * | a /= b;    | a = a / b; |
 * +------------+------------+
 * | a %= b;    | a = a % b; |
 * +------------+------------+
 * OBS.: Forma abreviada de atribuição, onde o operador de atribuição é combinado com um operador aritmético.
 * =======================================================================
 */

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAtribuicaoCumulativa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite a quantidade de minutos: ");
		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if (minutos > 100) {
//			conta = conta + (minutos - 100) * 2.00; // forma tradicional,armazena conta (50) + minutos - 100(franquia) = excedente * 2
			conta += (minutos - 100) * 2.00;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		sc.close();
		
	}

}
