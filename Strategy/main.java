package software_design.strategy;

public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(FuncionarioEnum.DESENVOLVEDOR, 2100, 1);
		System.out.println(umFuncionario.calcularGratificacao());
		
		Funcionario outroFuncionario = new Funcionario(FuncionarioEnum.DBA,	1700, 2);
		System.out.println(outroFuncionario.calcularGratificacao());
	}
}