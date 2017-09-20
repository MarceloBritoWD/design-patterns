public class Aviao extends Veiculo {
  private String prefixo;
  private int numTurbinas;
  
  public Aviao (String prefixo, int numTurbinas, String modelo,  int numLugares,  int comprimento,  int ano,  String cor) {
    super(modelo, numLugares, comprimento, ano, cor);
    this.prefixo = prefixo;
    this.numTurbinas = numTurbinas;
  }

}