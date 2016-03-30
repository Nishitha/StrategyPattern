package bank;

public class CustomerLoanCalculator implements LoanCalculator {
	
	private final double rateOfInterest = 10;

	/**
	 * 	This method calculates the total loan amount to be paid by the customer of a bank based on
	 *  the principal amount and the loan period. The rate of interest for a customer is 10%.
	 */
	@Override
	public double calculateLoan(double principalAmount, double loanPeriod) {
		double totalLoanAmountPaid = principalAmount * (1 + (rateOfInterest * loanPeriod));
		return totalLoanAmountPaid;

	}

}
