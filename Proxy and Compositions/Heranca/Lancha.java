public class Lancha extends Veiculo {
  private int numMotores;

  public Lancha(int numMotores, String modelo,  int numLugares,  int comprimento,  int ano, String cor) {
    super(modelo, numLugares, comprimento, ano, cor);
    this.numMotores = numMotores;
  }

}