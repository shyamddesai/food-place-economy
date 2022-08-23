public class Check {
	private double menuPrice;
	private double salesTax;
	private double tip;

	public Check(double menuPrice) {
		/* TODO: Add your code here */
		this.menuPrice = menuPrice;
		salesTax = 0.15*menuPrice;
	}

	public double getMenuPrice() {
		return this.menuPrice;
	}

	public double getSalesTax() {
		return this.salesTax;
	}

	public double getTip() {
		return this.tip;
	}

	public void setTipByPct(double tipPct) {
		/* TODO: Add your code here */
		this.tip = tipPct*menuPrice*0.01;
	}
}
