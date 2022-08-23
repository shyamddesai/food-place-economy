import java.util.ArrayList;
import java.util.List;

public class FoodStand extends FoodPlace {

    public FoodStand(String name, double fixedCosts, WorkingOwner owner) {
        /* TODO: Add your code here */
        /* TODO: Also edit the super call */
        super(name, fixedCosts, owner);
    }

    @Override
    public String toString() {
        return "Name of FoodStand: " + this.getName() +
                "\n" + "Owner: " + this.getOwner();
    }

    @Override
    public void workShift(int hours) {
        // no salaried workers so do nothing
    }

    @Override
    public List<IncomeTaxPayer> getIncomeTaxPayers() {
        /* TODO: Add your code here */
        /* TODO: Also remove return statement below*/
    	List<IncomeTaxPayer> taxPayers = new ArrayList<IncomeTaxPayer>();
     	taxPayers.add(getOwner());
       return taxPayers; //Returns an ArrayList containing the owner
    }

    @Override
    public void distributeIncomeAndSalesTax(Check check) {
        /* TODO: Add your code here */
		getOwner().setIncome(getOwner().getIncome() + check.getMenuPrice() + check.getTip()); //Tip in Check is in actual $
    	setTotalSalesTax(check.getSalesTax());
    	//System.out.println("Owner Tip %: " + getTipPercentage() + "; Customer Tip %: " + 0.01*check.getTip() + "; Menu Price: " + check.getMenuPrice() + "; Owner: " + getOwner().getIncome());
    }

    @Override
    public double getTipPercentage() {
        /* TODO: Add your code here */
        /* TODO: Also remove return statement below*/
       return ((WorkingOwner) getOwner()).getTargetTipPct();
    }
}
