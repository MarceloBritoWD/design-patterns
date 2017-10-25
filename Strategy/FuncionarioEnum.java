package software_design.strategy;

public enum FuncionarioEnum implements Gratificacao {
	
	DESENVOLVEDOR {
		@Override
		public double calcularGratificacao(Funcionario umFuncionario) {
			if (umFuncionario.getNivel() >= 2) {
				return umFuncionario.getSalarioBase() * 1.25;
			}
			
			return umFuncionario.getSalarioBase() * 1.15;
		}
	},
	
	DBA {
		@Override
		public double calcularGratificacao(Funcionario umFuncionario) {
			if (umFuncionario.getNivel() >= 2) {
				return umFuncionario.getSalarioBase() * 1.25;
			}
			
			return umFuncionario.getSalarioBase() * 1.15;
		}
	},
	
	LIDER {
		@Override
		public double calcularGratificacao(Funcionario umFuncionario) {
			if (umFuncionario.getNivel() >= 2) {
            	return umFuncionario.getSalarioBase() * 1.35;
			}
			
			return umFuncionario.getSalarioBase() * 1.25;
		}
	},
	
	GERENTE {
		@Override
		public double calcularGratificacao(Funcionario umFuncionario) {
			if (umFuncionario.getNivel() >= 2) {
            	return umFuncionario.getSalarioBase() * 1.45;
			}
			
			return umFuncionario.getSalarioBase() * 1.30;
		}
	}
	
	

}
