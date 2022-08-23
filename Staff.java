public class Staff extends IncomeTaxPayer {

	private int salaryPerHour;
	final private int incomeTaxPercentage = 25;

	public Staff(String name, boolean isCook) {
		/* TODO: Add your code here */
		/* TODO: Also edit the super call */
		super(name);
		if(isCook) salaryPerHour = 20; //Cook salary
		else salaryPerHour = 10; //Staff salary 
	}

	public int getSalaryPerHour() {
		return salaryPerHour;
	}

	public int getIncomeTaxPercentage() {
		return incomeTaxPercentage;
	}

	public double workHours(int numHours) {
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
		setIncome(getIncome() + numHours*salaryPerHour);
		return numHours*salaryPerHour;
	}

	@Override
	public double calculateIncomeTax() {
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
		return getIncome()*0.01*incomeTaxPercentage;
	}
}
