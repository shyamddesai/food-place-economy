public class Customer  {

	private String name;
	private int  targetTipPct;

	public Customer(String name, int targetTipPct) {
		/* TODO: Add your code here */
		this.name = name;
		this.targetTipPct = targetTipPct;
	}

	public String getName() {
		return name;
	}

	public int getTargetTipPct() {
		return targetTipPct;
	}

	public String getDescriptiveMessage(FoodPlace foodPlace) {
		return this.name + " dined in " + foodPlace.getName();
	}

	public void dineAndPayCheck(FoodPlace foodPlace, double menuPrice) {
		/* TODO: Add your code here */
		Check check = new Check(menuPrice);
		check.setTipByPct(0.5*(targetTipPct + foodPlace.getTipPercentage())); //Tip % = (CustomerTargetTip + FoodPlace Tip%)/2
		foodPlace.distributeIncomeAndSalesTax(check);
	}
}
