package bank;

public class BankOperator {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(new EmployeeLoanCalculator());
		emp1.setPrincipalAmount(100);
		emp1.setLoanPeriod(10);
		System.out.println("Loan amount for an employee with P=100 and t=10 is " + String.valueOf(emp1.getLoanAmount()));
		
		Customer c1 = new Customer(new CustomerLoanCalculator());
		c1.setPrincipalAmount(100);
		c1.setTimePeriod(10);
		System.out.println("Loan amount for a customer with P=100 and t=10 is " + String.valueOf(c1.getLoanAmount()));
	}

}
