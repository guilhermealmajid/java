/* Aula 40
 * [Expressao] --> Resultado --> [Valor Verdade]
 *    5 > 10   --> Resultado --> false
 *    
 * =================================================
 * || OPERADORES COMPARATIVOS (C, C++, Java, C#)  || 
 * =================================================
 * +----------+--------------------+
 * | Operador | Significado        |
 * +----------+--------------------+
 * |    >     | maior              |
 * |    <     | menor              |
 * |    >=    | maior ou igual     |
 * |    <=    | menor ou igual     |
 * |    ==    | igual              |
 * |    !=    | diferente          |
 * +----------+--------------------+
 * 
 * =======================================================================
 * EXEMPLOS DE EXPRESSÕES COMPARATIVAS
 * =======================================================================
 * Considerar: int x = 5;
 * * +------------+------------------------+
 * | Expressão  | Resultado em Java      |
 * +------------+------------------------+
 * |   x > 0    | true   (Verdadeiro)    |
 * |   x == 3   | false  (Falso)         |
 * |  10 <= 30  | true   (Verdadeiro)    |
 * |   x != 2   | true   (Verdadeiro)    |
 * +------------+------------------------+
 */

public class ExpressoesComparativas {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("A valendo 10 e B valendo 20:");
		System.out.println();
		
		System.out.println("a > b: " + (a > b)); // false
		System.out.println("a < b: " + (a < b)); // true
		System.out.println("a == b: " + (a == b)); // false
		System.out.println("a != b: " + (a != b)); // true
		System.out.println("a >= b: " + (a >= b)); // false
		System.out.println("a <= b: " + (a <= b)); // true
	}

}
