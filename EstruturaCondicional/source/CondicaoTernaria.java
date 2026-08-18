/*
 *  ╭───────────────────────────────────────────╮
 *  │            CondicaoTernaria               │
 *  ╰───────────────────────────────────────────╯
 *  Descrição : 
 *  Autor     : Guilhermão Almeida
 *  Data      : 17/08/2026 as 21:00HR
 */

void main() {

  double preco = 34.5;
  double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
  // Condição Ternária: (condição) ? valor_se_verdadeiro : valor_se_falso.
  // É uma forma de simplificar a estrutura condicional if-else, tornando o código
  // mais conciso e legível.

  System.out.println("Desconto: " + desconto);

}
