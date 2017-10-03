
public class ParenteseDireito extends DecoratorCaractere {

	public ParenteseDireito(Caractere decoradorCaractere) {
		super(decoradorCaractere);
	}
	
	public void imprimir() {
		
		decoradorCaractere.imprimir();
		imprimirParenteseDireito();
	}
	
	public void imprimirParenteseDireito(){ 
		System.out.print(")");
	}

}
