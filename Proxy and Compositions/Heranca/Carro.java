public class Carro extends Veiculo {
  private int numPortas;
  private String placa;

  public Carro (int numPortas, String placa, String modelo, int numLugares, int comprimento, int ano, String cor) {
    super(modelo, numLugares, comprimento, ano, cor);
    this.numPortas = numPortas;
    this.placa = placa;
  }
}
