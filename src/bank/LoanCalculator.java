package bank;

public interface LoanCalculator {
	
	/**
	 *  A = P(1 + rt) where A is the total loan amount to be paid,
	 *  P is the principal amount borrowed from the bank,
	 *  r = R/100  R is the rate of interest,
	 *  t is the time period for which the principal amount is borrowed.
	 *  
	 * @param principalAmount
	 * @param loanPeriod
	 * @return
	 */
	public double calculateLoan(double principalAmount, double loanPeriod);

}
