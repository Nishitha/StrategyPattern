package bank;

public class EmployeeLoanCalculator implements LoanCalculator {
	
	private final double rateOfInterest = 5;

	/**
	 * 	This method calculates the total loan amount to be paid by the an employee of a bank(internal customer)
	 *  based on the principal amount and the loan period. The rate of interest for an internal customer is 5%.
	 */
	@Override
	public double calculateLoan(double principalAmount, double loanPeriod) {
		double totalLoanAmountPaid = principalAmount * (1 + (rateOfInterest * loanPeriod));
		return totalLoanAmountPaid;

	}

}
