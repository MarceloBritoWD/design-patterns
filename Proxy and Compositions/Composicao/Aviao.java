public class Aviao {
  private String prefixo;
  private int numTurbinas;
  private Veiculo veiculo;
  
  public Aviao (String prefixo, int numTurbinas, String modelo, int numLugares, int comprimento, int ano, String cor) {
    this.prefixo = prefixo;
    this.numTurbinas = numTurbinas;
    this.veiculo = new Veiculo(modelo, numLugares, comprimento, ano, cor);
  }

}