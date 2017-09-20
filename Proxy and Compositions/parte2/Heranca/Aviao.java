public class Aviao extends Veiculo {
  private String prefixo;
  private int numTurbinas;
  
  public Aviao (String prefixo, int numTurbinas, String modelo,  int numLugares,  int comprimento,  int ano,  int cor) {
    this.prefixo = prefixo;
    this.numTurbinas = numTurbinas;

    super.modelo = modelo;
    super.numLugares = numLugares;
    super.comprimento = comprimento;
    super.ano = ano;
    super.cor = cor;
  }

}