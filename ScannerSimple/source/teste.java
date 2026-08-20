import java.util.Locale;
import java.util.Scanner;

public class teste {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    double b = sc.nextDouble();
    IO.println("Primeiro valor: " + a + "\nValor decimal: " + b);
    sc.close();
  }
}
