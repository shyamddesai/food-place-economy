import java.util.ArrayList;
import java.util.List;

public class Restaurant extends FoodPlace {

	private Staff cook;
	private Server server;

	public Restaurant(String name, double fixedCosts, Owner owner, Staff cook, Server server) {
		/* TODO: Add your code here */
		/* TODO: Also edit the super call */
		super(name, fixedCosts, owner);
		this.cook = cook;
		this.server = server;
	}

	public Staff getCook() {
		return cook;
	}

	public Server getServer() {
		return server;
	}

	@Override
	public String toString() {
		return "Name of restaurant: " + this.getName() +
				"\n" + "Owner: " + this.getOwner() +
				"\n" + "Cook: " + cook +
				"\n" + "Server: " + server;
	}

	@Override
	public void workShift(int hours) {
		/* TODO: Add your code here */
		double cookHours = cook.workHours(hours);
		double serverHours = server.workHours(hours);
		getOwner().setSalaryExpenses(getOwner().getSalaryExpenses() + cookHours + serverHours);
	}

	@Override
	public List<IncomeTaxPayer> getIncomeTaxPayers() {
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
    	List<IncomeTaxPayer> taxPayers = new ArrayList<IncomeTaxPayer>();
   		taxPayers.add(getCook());
   		taxPayers.add(getServer());
   		taxPayers.add(getOwner());
   		return taxPayers;
	}

	@Override
	public void distributeIncomeAndSalesTax(Check check) {
		/* TODO: Add your code here */
		getOwner().setIncome(getOwner().getIncome() + check.getMenuPrice());
		
		cook.setIncome(cook.getIncome() + 0.2*check.getTip());
		server.setIncome(server.getIncome() + 0.8*check.getTip());

		setTotalSalesTax(getTotalSalesTax() + check.getSalesTax());
	}

	@Override
	public double getTipPercentage() {
		/* TODO: Add your code here */
		/* TODO: Also remove return statement below*/
		return getServer().getTargetTipPct();
	}
}
