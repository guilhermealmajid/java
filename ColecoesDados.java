void main() {

  // @formatter:off
  /*
   * ArrayList é uma coleção de dados que permite armazenar elementos de
   * forma ordenada e permite elementos duplicados. É uma das implementações da interface List em Java.
   *
   */
  // @formatter:on
  //
  ArrayList<String> lista = new ArrayList<>();

  lista.add("Guilherme");
  lista.add("Layla");
  lista.add("Isaque");
  // lista.remove(0);
  // lista.remove("Layla");

  String[] nomesArry = new String[10];
  // formatter:off
  /*
   * Vetor uso palavra reservada new e Crio, instancio um
   * objeto do tipo String e defino o tamanho do vetor de 10 posicoes
   * 
   */
  // formatter:on

  nomesArry[0] = "Guilherme";
  nomesArry[1] = "Mauro";
  nomesArry[2] = "Virginia";
  nomesArry[3] = "Layla";
  nomesArry[4] = "Isaque";
  nomesArry[5] = "João";

  // jovem nois na fita mano

  for (int vetores = 0; vetores < nomesArry.length; vetores++) {
    IO.println("vetores " + vetores + ": " + nomesArry[vetores]);
    // Int vetores começa com posicao 0,enquanto length do meu vetores
    // for menor que 10, incrementa +1 ate consumir todas as posicoes do vetor
  }

  for (int i = 0; i < lista.size(); i++) {
    // no arraylist, usamos o metodo size() para saber o tamanho da lista
    IO.println("ArrayList " + i + ": " + lista.get(i));
  }

  // IO.println("Lista: " + lista);

}
