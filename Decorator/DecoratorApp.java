
public class DecoratorApp {
	
	public static void main(String[] args) {
		Caractere decorator = new NumeroUm();
		decorator = new ParenteseEsquerdo(decorator);
		decorator = new ParenteseDireito(decorator);		
		decorator = new ChaveEsquerda(decorator);		
		decorator = new ChaveDireita(decorator);
		decorator.imprimir();
		System.out.println();
	}
}
