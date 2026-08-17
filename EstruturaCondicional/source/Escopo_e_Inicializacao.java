void main() {
	
	double price = 400.0;
	double discount;
	/* Variável nao inicializada o que gera erro de compilação. 
	 * Iniciar com valor 0.0 ou na Estrutura de controle no else colocar a variavel com valor.
	 * Obs.: Variáveis globais sao usadas em toda a Classe e em qualquer método ou bloco de código como Estrutura de controle,
	 * o inverso disso ela só pode ser usada onde foi declarada. .
	 */
	
	if (price < 200.0) {
		discount = price * 0.1;
	} else {
		discount = 0;
	}	
	
	System.out.println(discount);
}