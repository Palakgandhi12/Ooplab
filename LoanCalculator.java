class LoanCalculator 
{

	void calculateEMI(int principal, int time, float rate) 
	{
		float interest = (principal * rate * time) / 100;
		float emi = (principal + interest) / time;
		System.out.println("Loan Type: Home Loan");
		System.out.println("EMI = Rs. " + emi);
		System.out.println();
	}

	void calculateEMI(double principal, int time, double rate) 
	{
		double interest = (principal * rate * time) / 100;
		double emi = (principal + interest) / time;
		System.out.println("Loan Type: Vehicle Loan");
		System.out.println("EMI = Rs. " + emi);
		System.out.println();
	}

	void calculateEMI(int principal, int time) 
	{
		int rate = 10;
		double interest = (principal * rate * time) / 100.0;
		double emi = (principal + interest) / time;
		System.out.println("Loan Type: Personal Loan");
		System.out.println("EMI = Rs. " + emi);
		System.out.println();
	}

	public static void main(String[] args) 
	{
		LoanCalculator loan = new LoanCalculator();

		loan.calculateEMI(500000, 20, 8.5f);

		loan.calculateEMI(300000.0, 5, 9.0);

		loan.calculateEMI(100000, 2);
	}
}