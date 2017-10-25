package software_design.strategy;

/* Exemplo inspirado no exemplo do Marcos Brizeno 
 * https://brizeno.wordpress.com/category/padroes-de-projeto/strategy/
 */
public class Funcionario {
	protected FuncionarioEnum tipoFuncionario;
	protected double salarioBase;
	protected String cargo;
    protected int nivel;

	public Funcionario(FuncionarioEnum cargo, double salarioBase, int nivel) {
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		this.cargo = cargo.name();
		this.tipoFuncionario = cargo;
	}

	public double calcularGratificacao() {
		return tipoFuncionario.calcularGratificacao(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
  
  	public int getNivel() {
		return nivel;
	}
}