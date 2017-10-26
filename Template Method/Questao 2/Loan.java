
public class Loan {
	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double unusedRiskAmount() {
		return 1;
	}

	public double outstandingRiskAmount() {
		return 4;
	}

	public int getCommitment() {
		return 2;
	}

	public double getUnusedPercentage() {
		return .25;
	}
}
