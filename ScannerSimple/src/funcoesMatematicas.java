/* Aula 35 - Funções matemáticas em Java
 * 
 */
public class funcoesMatematicas {
	
	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x); //Raiz quadrada de x
		B = Math.sqrt(y); //Raiz quadrada de y
		C = Math.sqrt(25.0); //Raiz quadrada de 25
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y); //x elevado a y
		B = Math.pow(x, 2.0); //x elevado a 2
		C = Math.pow(5.0, 2.0); //5 elevado a
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y); //Valor absoluto de z
		B = Math.abs(z); //Valor absoluto de z
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		/* Incluindo funções em expressoes maiores
		 * 
		 *      -b  ±  √Δ                 +----------------+
		 * x = -----------                |  Δ = b² - 4ac  |
		 *        2 . a                   +----------------+
		 *        
		 *   delta = Math.pow(b, 2.0) - 4 * a * c;
		 *   x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		 *   x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		 */
		
		
	}

}
