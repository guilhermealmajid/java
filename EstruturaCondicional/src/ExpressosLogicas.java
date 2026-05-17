/*
 * Aula 41 - 4:26 minutos de video
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
 * * O resultado só será false se TODAS as condições forem falsas.
 */

public @interface ExpressosLogicas {

}
