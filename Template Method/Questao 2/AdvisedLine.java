
public class AdvisedLine extends CapitalStrategy {
	
	@Override
	public double capital(Loan loan){
		return loan.getCommitment() * loan.getUnusedPercentage() * duration(loan) * riskFactorFor(loan);
	}
}
