/*
 * Aula 41 
 * =======================================================================
 * OPERADORES LÓGICOS (C, C++, Java, C#)
 * =======================================================================
 * +----------+--------------------+
 * | Operador | Significado        |
 * +----------+--------------------+
 * |    &&    | E                  |
 * |    ||    | OU                 |
 * |    !     | NÃO                |
 * +----------+--------------------+
 * 
 * * =======================================================================
 * IDEIA POR TRÁS DO OPERADOR "E" (&&)
 * =======================================================================
 * REGRA: Você só obtém a habilitação se TODAS as condições forem TRUE.
 * * +---------------------------------+---------+
 * | Condição                        | Status  |
 * +---------------------------------+---------+
 * | Aprovado no exame psicotécnico  |  &&     |
 * | Aprovado no exame de legislação |  &&     |
 * | Aprovado no exame de direção    |  &&     |
 * +---------------------------------+---------+
 * | RESULTADO: Habilitação emitida! |  true   |
 * +---------------------------------+---------+
 * * Todas Condições term ser TRUE! Se APENAS UMA das condições acima for false, o resultado será false.
 * 
 * * -----------------------------------------------------------------------
 * Exemplos de Expressões Lógicas com o Operador "E" (&&)
 * -----------------------------------------------------------------------
 * * Suponha x igual a 5:
 * x <= 20  &&  x == 10
 * \_____/      \_____/
 * true         false     ====>  Resultado: false
 * 
 * x > 0    &&  x != 3
 * \____/       \____/
 * true         true      ====>  Resultado: true
 * 
 * x <= 20  &&  x == 10  &&  x != 3
 * \_____/      \_____/      \____/
 * true         false        true ====>  Resultado: false
 * * =======================================================================
 * 
 * =======================================================================
 * TABELA VERDADE DO OPERADOR "E" (&&)
 * =======================================================================
 * REGRA: O resultado só é true quando AMBOS os lados forem true.
 * * +-----------+-----------+-----------+
 * |     A     |     B     |  A && B   |
 * +-----------+-----------+-----------+
 * | false (F) | false (F) | false (F) |
 * | false (F) | true  (V) | false (F) |
 * | true  (V) | false (F) | false (F) |
 * | true  (V) | true  (V) | true  (V) |
 * +-----------+-----------+-----------+
 * 
 * =======================================================================
 * IDEIA POR TRÁS DO OPERADOR "OU" (||)
 * =======================================================================
 * REGRA: Você pode estacionar se PELO MENOS UMA condição for TRUE.
 * * +---------------------------------------+---------+
 * | Condição                                | Status  |
 * +---------------------------------------+-----------+
 * | For idoso(a)                            |  ||     |
 * | For uma pessoa com deficiência          |  ||     |
 * | For uma gestante                        |  ||
 * +---------------------------------------+-----------+
 * | RESULTADO: Permissão para estacionar!   |  true   |
 * +---------------------------------------+---------+
 * * Pelo menos uma condição deve ser verdadeira.
 * 
 * * Exemplo de Expressões Lógicas com o Operador "OU" (||):
 * 
 * x == 10  ||  x <= 20
 * \_____/      \_____/
 * false        true      ====>  Resultado Final: true
 * 
 * * Exemplo 2:
 * x > 0    ||  x != 3
 * \____/       \____/
 * true         true      ====>  Resultado Final: true
 * 
 * * Exemplo 3:
 * x <= 0   ||  x != 3   ||  x != 5
 * \____/       \____/       \____/
 * false        true         false    ====>  Resultado Final: true
 * * =======================================================================
 * 
 * * =======================================================================
 * TABELA VERDADE DO OPERADOR "OU" (||)
 * =======================================================================
 * REGRA: O resultado é true se pelo menos UM dos lados for true.
 * * +-----------+-----------+-----------+
 * |     A     |     B     |  A || B   |
 * +-----------+-----------+-----------+
 * | false (F) | false (F) | false (F) |
 * | false (F) | true  (V) | true  (V) |
 * | true  (V) | false (F) | true  (V) |
 * | true  (V) | true  (V) | true  (V) |
 * +-----------+-----------+-----------+
 * 
 * =======================================================================
 * IDEIA POR TRÁS DO OPERADOR "NÃO" (!) - INVERSÃO LÓGICA
 * =======================================================================
 * REGRA: Você tem direito à bolsa se NÃO possuir renda maior que $ 3000,00.
 * Ou seja: !(renda > 3000.00)
 * * Simulação com os personagens:
 * -----------------------------------------------------------------------
 * * 🧑 João (Renda: $ 5000.00)
 * -> Expressão: (5000.00 > 3000.00)  => true
 * -> Com o NOT: !(true)              => false ❌ (Não ganha a bolsa)
 * 
 * * 🧑 José (Renda: $ 2000.00)
 * -> Expressão: (2000.00 > 3000.00)  => false
 * -> Com o NOT: !(false)             => true  ✅ (Ganha a bolsa!)
 * * -----------------------------------------------------------------------
 * Tabela de Validação em ASCII Art:
 * -----------------------------------------------------------------------
 * +----------+-----------+--------------------+------------------------+
 * | Nome     | Renda     | Renda > $ 3000.00  | !(Renda > $ 3000.00)   |
 * +----------+-----------+--------------------+------------------------+
 * | João     | $ 5000.00 | true  (Fato)       | false  [ Sem Bolsa ] ❌ |
 * | José     | $ 2000.00 | false (Fato)       | true   [ Tem Bolsa ] ✅ |
 * +----------+-----------+--------------------+------------------------+
 * 
 * =======================================================================
 * EXEMPLOS DE EXPRESSÕES LÓGICAS COM OPERADOR "NÃO" (!)
 * =======================================================================
 * Considerar: int x = 5;
 * 
 * !( x == 10 )
 * \_______/
 * false      =====>  Inverte para: true  ✅
 * 
 * * Exemplo 2:
 * !( x >= 2 )
 * \______/
 * true       =====>  Inverte para: false ❌
 * * =======================================================================
 * 
 * Considerar: int x = 5;
 * 
 *  * !(  x <= 20    &&    x == 10  )
 *    |   \______/          \______/
 *    |     true             false
 *    |       \_________________/
 *    |              |
 *    |             false  (Resultado do &&)
 *    \_________________/  (Resultado da expressão dentro do ! - Negação)
 *            |
 *            V - True
 *            
 * true   (Inversão final pelo !)
 * * -----------------------------------------------------------------------
 * Resultado Final em Java: true (V)
 * =======================================================================
 * 
 * 
 * =======================================================================
 * TABELA VERDADE DO OPERADOR "NÃO" (!)
 * =======================================================================
 * REGRA: Inverte o estado lógico atual (Negação).
 * * +-----------+-----------+
 * |     A     |    ! A    |
 * +-----------+-----------+
 * | false (F) | true  (V) |
 * | true  (V) | false (F) |
 * +-----------+-----------+
 * 
 * =======================================================================
 * RESUMO DA AULA - Expressões lógicas
 * =======================================================================
 * • Operadores: && (e), || (ou), ! (não)
 * • Tabelas verdade
 * • Exemplos de expressões lógicas
 * * =======================================================================
 */

public @interface ExpressosLogicas {

}
