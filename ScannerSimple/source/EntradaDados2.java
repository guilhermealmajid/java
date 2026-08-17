/* Aula 34 - Entrada de Dados com Scanner - Parte 2
 * 
 */

import java.util.Scanner;

//Ler linha inteira com quebra de linha, usando nextLine() para ler a string completa incluindo os espaços.
public class EntradaDados2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;	//Simular Quebra de linha pendente do nextInt(),nextDouble() etc, o nextLine() absorve a quebra de linha pendente,e passa para o proximo S2.
		String s1, s2, s3;
		
		System.out.println("Digite três palavras:"); //Só mandar nextLine() no Linux abre console,tenho mandar um println antes.
		x = sc.nextInt();
		sc.nextLine(); //Esse nextLine() absorve a quebra de linha pendente do nextInt() limpando o buffer e permite proximo nextLine() ler a string.
		s1 = sc.nextLine(); //Neste exemplo o nextLine() absorve a quebra de linha pendente do nextInt(), e passa para o próximo s2, que é o próximo nextLine() que vai ler a string completa.
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
		/* Resumo da Aula: 
		 * - Scanner
		 *   . next()
		 *   . nextInt()
		 *   . nextDouble()
		 *   . next().charAt(0)
		 *   
		 * - Locale
		 * - Como ler até a quebra de linha
		 *   . nextLine()
		 *   . como limpar o Buffer de leitura (Quebra de linbha pendente do nextInt(),nextDouble() etc, o nextLine() absorve a quebra de linha pendente,e passa para o proximo S2.)
		 */
	}

}
