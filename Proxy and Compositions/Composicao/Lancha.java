public class Lancha {
  private numMotores int;
  private Veiculo veiculo;

  public Lancha (int numMotores, String modelo, int numLugares, int comprimento, int ano, String cor) {
    this.numMotores = numMotores;
    this.veiculo = new Veiculo(modelo, numLugares, comprimento, ano, cor);
  }

}