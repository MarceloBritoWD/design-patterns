public class TermLoan extends CapitalStrategy {
	
	@Override
	public double capital(Loan loan){
		return loan.getCommitment();
	}

}
