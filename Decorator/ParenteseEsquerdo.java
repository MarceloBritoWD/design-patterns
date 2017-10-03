
public class ParenteseEsquerdo extends DecoratorCaractere {

	public ParenteseEsquerdo(Caractere decoradorCaractere) {
		super(decoradorCaractere);
	}
	
	public void imprimir() {
		imprimirParenteseEsquerdo();
		decoradorCaractere.imprimir();
	}
	
	public void imprimirParenteseEsquerdo(){ 
		System.out.print("(");
	}

}
