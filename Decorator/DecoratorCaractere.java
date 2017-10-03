
public abstract class DecoratorCaractere extends Caractere {
	protected Caractere decoradorCaractere;
	
	public DecoratorCaractere(Caractere decoradorCaractere){
		this.decoradorCaractere = decoradorCaractere;
	}
}
