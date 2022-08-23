public class Owner extends IncomeTaxPayer {

	final private int incomeTaxPct = 10;
	private double salaryExpenses;
	private FoodPlace foodPlace;

	public Owner(String name) {
		/* TODO: Add your code here */
		/* TODO: Also edit the super call */
		super(name);
	}
	
	public FoodPlace getFoodPlace() {
		return foodPlace;
	}

	public int getIncomeTaxPct() {
		return incomeTaxPct;
	}

	public double getSalaryExpenses() {
		return salaryExpenses;
	}

	public void setSalaryExpenses(double salaryExpenses) {
		this.salaryExpenses = salaryExpenses;
	}

	public void setFoodPlace(FoodPlace foodPlace) {
		this.foodPlace = foodPlace;
	}

	@Override
	public double calculateIncomeTax() {
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
		double ownerIncome = getIncome(); //The sum of menu prices is added to the owner's income 
		double ownerExpenses = getSalaryExpenses() + foodPlace.getFixedCosts(); 
		//System.out.print(getName() + " Income: " + ownerIncome + " & Expenses: " + ownerExpenses + " \t");
		if(ownerIncome-ownerExpenses > 0) {
			return 0.01*getIncomeTaxPct()*(ownerIncome-ownerExpenses); 
		} else return 0; //Else tax = 0
	}
}
