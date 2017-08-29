public class JanelaRefact {
  private static JanelaRefact instancia;
  private int qtdPortas;
  private String cor;

  private JanelaRefact(int qtdPortas, String cor){
    this.qtdPortas = qtdPortas;
    this.cor = cor;
  }

  public static String abrir() {
    return "Janela aberta!";
  }

  public static String fechar() {
    return "Janela aberta!";
  }

  public static synchronized JanelaRefact getInstancia() {
    if (instancia == null) {
      instancia = new JanelaRefact(2, "azul");    
    }
    
    return instancia;
  }
}