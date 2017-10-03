public class ChaveDireita extends DecoratorCaractere {

	public ChaveDireita(Caractere decoradorCaractere) {
		super(decoradorCaractere);
	}
	
	public void imprimir() {
		
		decoradorCaractere.imprimir();
		imprimirChaveDireita();
	}
	
	public void imprimirChaveDireita(){ 
		System.out.print("}");
	}

}