class BillGenerator 
{

	void generateBill(int itemTotal) 
	{
		System.out.println("Customer Type: Regular");
		System.out.println("Total Bill Amount = Rs. " + itemTotal);
	}

	void generateBill(int itemTotal, int discount) 
	{
		int finalAmount = itemTotal - discount;
		System.out.println("Customer Type: Privileged");
		System.out.println("Discount = Rs. " + discount);
		System.out.println("Final Bill Amount = Rs. " + finalAmount);
	}

	void generateBill(int itemTotal, double discountPercent) 
	{
		double discountAmount = itemTotal * discountPercent / 100;
		double finalAmount = itemTotal - discountAmount;
		System.out.println("Customer Type: Festive Offer");
		System.out.println("Discount = " + discountPercent + "%");
		System.out.println("Final Bill Amount = Rs. " + finalAmount);
	}
	public static void main(String[] args) {
		BillGenerator bill = new BillGenerator();

		bill.generateBill(5000);
		System.out.println();

		bill.generateBill(5000, 500);
		System.out.println();

		bill.generateBill(5000, 10.0);
	}
}