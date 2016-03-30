package bank;

public class Customer {
	
	private LoanCalculator loanCalculator;
	private double principalAmount;
	private double timePeriod;
	
	public Customer(LoanCalculator loanCalculator) {
		this.loanCalculator = loanCalculator;
	}
	
	public double getPrincipalAmount() {
		return principalAmount;
	}



	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}



	public double getTimePeriod() {
		return timePeriod;
	}



	public void setTimePeriod(double timePeriod) {
		this.timePeriod = timePeriod;
	}



	public double getLoanAmount(){
		return this.loanCalculator.calculateLoan(this.principalAmount, this.timePeriod);
	}
	
	

}
