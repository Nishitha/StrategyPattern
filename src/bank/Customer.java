package bank;

public class Customer {
	
	private LoanCalculator loanCalculator;
	private double principalAmount;
	private double loanPeriod = 0;
	
	public Customer(LoanCalculator loanCalculator) {
		this.loanCalculator = loanCalculator;
		
	}
	

	public double getPrincipalAmount() {
		return principalAmount;
	}




	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}




	public double getLoanPeriod() {
		return loanPeriod;
	}


	public void setLoanPeriod(double loanPeriod) {
		this.loanPeriod = loanPeriod;
	}




	public double getLoanAmount(){
		return this.loanCalculator.calculateLoan(this.principalAmount, this.loanPeriod);
	}
	
	

}
