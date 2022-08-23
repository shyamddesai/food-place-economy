import java.util.ArrayList;
import java.util.List;

public class FastFood extends FoodPlace {

    private List<Staff> staff = new ArrayList<>();

    public FastFood(String name, double fixedCosts, Owner owner, List<Staff> staff) {
        /* TODO: Add your code here */
        /* TODO: Also edit the super call */
    	super(name, fixedCosts, owner);	
    	for(int i=0; i<staff.size(); i++) {
    		this.staff.add(staff.get(i));
    	 }
    }

    public List<Staff> getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name of FastFood: " + this.getName() +
                "\n" + "Owner: " + this.getOwner());
        int index = 1;
        for (Staff staff: staff) {
            builder.append("\n" + "Staff " + index++ + " : " + staff );
        }
        return builder.toString();
    }

    @Override
    public void workShift(int hours) {
		/* TODO: Add your code here */
    	double workHours;
    	for(int i=0; i<staff.size(); i++) {
    		workHours = staff.get(i).workHours(hours);
    		getOwner().setSalaryExpenses(getOwner().getSalaryExpenses() + workHours);
    	} 
    }

    @Override
    public List<IncomeTaxPayer> getIncomeTaxPayers() {
        /* TODO: Add your code here */
        /* TODO: Also remove return statement below*/
    	List<IncomeTaxPayer> taxPayers = new ArrayList<IncomeTaxPayer>(staff.size());
      	 for(int i=0; i<staff.size(); i++) {
    		 taxPayers.add(staff.get(i));
    	 } taxPayers.add(getOwner());
        return taxPayers;
    }

    @Override
    public void distributeIncomeAndSalesTax(Check check) {
        /* TODO: Add your code here */
		getOwner().setIncome(check.getMenuPrice());
		int numStaff = getStaff().size();
		for(int i=0; i<numStaff; i++) {
			getStaff().get(i).setIncome(getStaff().get(i).getIncome() +check.getTip()/numStaff);
			//System.out.println("Owner Tip %: " + getTipPercentage() + "; Customer Tip %: " + 0.01*check.getTip() + "; Menu Price: " + check.getMenuPrice() + "; Owner: " + getOwner().getIncome() + "; Staff: " + getStaff().get(i));
		}
		setTotalSalesTax(getTotalSalesTax() + check.getSalesTax());
    }

    @Override
    public double getTipPercentage() {
        return 0;
    }
}
