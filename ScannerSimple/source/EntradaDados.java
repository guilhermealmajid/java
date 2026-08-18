import java.text.NumberFormat;
import java.util.Locale;

void main() throws Exception {
  // Uso do Throws Exception para tratar a excecao do parse do NumberFormat, que
  // pode gerar uma excecao de ParseException.

  // double k = Double.parseDouble(IO.readln("Digite o decimal: "));
  double k = NumberFormat.getInstance(Locale.GERMANY).parse(IO.readln("Digite o decimal: ")).doubleValue();
  IO.println("Decimal digitado: " + k);
  // Adoção de nova Sintaxe apartir do Java 21, com a classe IO, que substitui a
  // classe Scanner.
  String name = IO.readln("Entre c/Nome: ");
  // Defini a var String ja Manda readln ler entrada com println message.
  // Simplesmente louco, kkkk
  IO.println("Nome digitado: " + name);

  double numero = Double.parseDouble(IO.readln("Entre c/NumeroDecimal: "));
  // Double.parseDouble com readln "Scanner" e println
  IO.println(String.format("O número digitado é: %.4f", numero));
  // Para Formator o numero com 4 casas decimais, String.format com %.4f

  int inteiro = Integer.parseInt(IO.readln("Entre c/Inteiro: "));
  IO.println("Inteiro digitado: " + inteiro);

  char caractere = IO.readln("Entre seu Nome: ").charAt(0);
  IO.println("Primeiro caractere do nome digitado: " + caractere);

  String u = IO.readln("Digite o texto: ");
  int v = Integer.parseInt(IO.readln("Digite o inteiro: "));
  double w = Double.parseDouble(IO.readln("Digite o decimal: "));

  IO.println("Dados Digitados: ");
  IO.println(u);
  IO.println(v);
  IO.println(w);

  // @formatter:off
/*
 * Aqui está o resumo direto e sem enrolação daquela linha:
 *
 * double k = new Scanner(IO.readln("Texto: ")).useLocale(Locale.US).nextDouble();
 *
 * Essa linha faz 4 coisas em cadeia (da direita para a esquerda):
 *
 * 1. IO.readln(...) -> Lê o teclado e pega o texto (ex: "10.5").
 * 2. new Scanner(...) -> Cria um conversor temporário só para esse texto.
 * 3. .useLocale(Locale.US) -> Ensina o conversor a aceitar ponto . em vez de vírgula.
 * 4. .nextDouble() -> Transforma o texto "10.5" no número 10.5 de verdade para
 *    guardar na variável k.
 *
 * Em poucas palavras: O IO.readln pega o texto do teclado, o Scanner aplica o
 * Locale e o nextDouble() faz a conversão final para número.
 */
// @formatter:on

}
