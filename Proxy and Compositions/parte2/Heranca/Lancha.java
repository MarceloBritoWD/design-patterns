public class Lancha extends Veiculo {
  private numMotores int;

  public Lancha (int numMotores, String modelo,  int numLugares,  int comprimento,  int ano,  int cor) {
    this.numMotores = numMotores;

    super.modelo = modelo;
    super.numLugares = numLugares;
    super.comprimento = comprimento;
    super.ano = ano;
    super.cor = cor;
  }

}