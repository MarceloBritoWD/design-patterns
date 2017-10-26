
public abstract class CapitalStrategy {
	private Loan loan;
	public abstract double capital(Loan loan);
	
	
	public double duration(Loan loan) {
		return 1;
	};
	
	protected double riskFactorFor(Loan loan) {
		return 1;
	}
	

	private void doSomethingElse(double capital) {	
	}
	
	public void templateMethod(){
		doSomethingElse(capital(loan));
	}


}
