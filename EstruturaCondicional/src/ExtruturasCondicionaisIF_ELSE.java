/*
 * =======================================================================
 * Conceito
 * =======================================================================
 * Estrutura condicional:
 * * É uma estrutura de controle 				+-----------+
 * que permite definir que um 					| condição  |
 * certo bloco de comandos 						+-----------+
 * somente será executado 				       /             \
 * dependendo de uma condição		  V(TRUE) /               \ F (FALSE)
 * 									+---------+  				+---------+
 * 									| Bloco 1 |  				| Bloco 2 |
 * 									+---------+  				+---------+
 * Simples
 *  if (condição) {
 * 		<comando 1>
 *  	<comando 2>
 * }
 * 
 * Condicao composta
 *  if (condição) {
 * 		<comando 1>
 *  	<comando 2>
 * } else {
 * 		<comando 3>
 * 	    <comando 4>
 * }
 * 
 * =======================================================================
 * REGRA:
 * =======================================================================
 *  V: executa o bloco de comandos
 *  F: pula o bloco de comandos
 * * =======================================================================
 * 
 * /*
 * =======================================================================
 * Encadeamento de estruturas condicionais
 * =======================================================================
 * 	if ( condição 1 ) {
 * 		comando 1
 * 		comando 2
 * }
 * else {
 * 		if ( condição 2 ) {              +--------------------------+
 * 			comando 3                    |       Importante:        |
 * 			comando 4                    |   Repare na endentação!  |
 * 		}                                +--------------------------+
 * 		else {
 * 			comando 5
 * 			comando 6
 * 		}
 * }
 * =======================================================================
 * Encadeamento de estruturas condicionais
 * ======================================================================
 * 
 * 	if ( condição 1 ) {
 * 		comando 1
 * 		comando 2
 * }
 * else if ( condição 2 ) {              +--------------------------+
 * 			comando 3                    |       Importante:        |
 * 			comando 4                    |   Repare na endentação!  |
 * }                                	 +--------------------------+
 * else if ( condição 3 ) {            
 * 			comando 5                   
 * 			comando 6                   
 * }                                
 * else {
 * 		comando 7
 * 		comando 8
 * }
 * 
 */

import java.util.Scanner;

public class ExtruturasCondicionaisIF_ELSE {
	
	public static void main(String[] args) {
		int x = 5;
		int hora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Que horas são? ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else {
			if (hora < 18) {
			System.out.println("Boa tarde!");
			} else {
				System.out.println("Boa noite!");
			}
		}

//		System.out.println("Bom dia!");

//		if (x < 5) {
//			System.out.println("Boa tarde!");
//		} 
//			System.out.println("Boa noite!");

		

}

}
