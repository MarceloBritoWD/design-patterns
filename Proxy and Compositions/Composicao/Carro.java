public class Carro extends Veiculo {
  private int numPortas;
  private String placa;
  private Veiculo veiculo;

  public Carro (int umPortas, String placa, String modelo, int numLugares, int comprimento, int ano, String cor) {
    this.numPortas = numPortas;
    this.placa = placa;
    this.veiculo = new Veiculo(modelo, numLugares, comprimento, ano, cor);
  }
}
