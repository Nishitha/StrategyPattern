package bank;

public class BankOperator {
	
	public static void main(String[] args) {
		Customer internalCustomer = new Customer(new InternalCustomerLoanCalculator());
		internalCustomer.setPrincipalAmount(100);
		internalCustomer.setLoanPeriod(10);
		System.out.println("Loan amount for an employee with P=100 and t=10 is " + String.valueOf(internalCustomer.getLoanAmount()));
		
		Customer externalCustomer = new Customer(new ExternalCustomerLoanCalculator());
		externalCustomer.setPrincipalAmount(100);
		externalCustomer.setLoanPeriod(10);
		System.out.println("Loan amount for a customer with P=100 and t=10 is " + String.valueOf(externalCustomer.getLoanAmount()));
	}

}
