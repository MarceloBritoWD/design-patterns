public class Carro extends Veiculo {
  private int numPortas;
  private String placa;

  public Carro (int umPortas, String placa, String modelo,  int numLugares,  int comprimento,  int ano,  int cor) {
    this.numPortas = numPortas;
    this.placa = placa;

    super.modelo = modelo;
    super.numLugares = numLugares;
    super.comprimento = comprimento;
    super.ano = ano;
    super.cor = cor;
  }
}
