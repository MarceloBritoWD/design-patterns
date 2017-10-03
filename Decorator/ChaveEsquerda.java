
public class ChaveEsquerda extends DecoratorCaractere {

	public ChaveEsquerda(Caractere decoradorCaractere) {
		super(decoradorCaractere);
	}
	
	public void imprimir() {
		imprimirChaveEsquerda();
		decoradorCaractere.imprimir();
	}
	
	public void imprimirChaveEsquerda(){ 
		System.out.print("{");
	}

}
