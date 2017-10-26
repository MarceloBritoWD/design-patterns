
public abstract class CapitalStrategy {
	private Loan loan;
	public abstract double capital(Loan loan);
	
	
	public double duration(Loan loan) {
		return 1;
	};
	
	protected double riskFactorFor(Loan loan) {
		return 1;
	}
	
	public double templateMethod(){
		return capital(loan) * riskFactorFor(loan) * duration(loan);
	}


}
