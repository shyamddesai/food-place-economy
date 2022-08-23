import java.util.ArrayList;
import java.util.List;

public class TaxCollector {

	private List<FoodPlace> foodPlaces = new ArrayList<>();

	private double incomeTaxCollected;
	private double salesTaxCollected;

	public TaxCollector(List<FoodPlace> foodPlaces) {
		/* TODO: Add your code here */
		this.foodPlaces = foodPlaces; //Setting by reference
	}

	public List<FoodPlace> getFoodPlaces() {
		return foodPlaces;
	}

	public double getIncomeTaxCollected() {
		return incomeTaxCollected;
	}

	public double getSalesTaxCollected() {
		return salesTaxCollected;
	}

	public void collectTax() {
		/* TODO: Add your code here */
		for (FoodPlace foodplace : foodPlaces) {
			salesTaxCollected += foodplace.getTotalSalesTax();
			for (IncomeTaxPayer incomeTaxPayer: foodplace.getIncomeTaxPayers()) {
				incomeTaxCollected += incomeTaxPayer.calculateIncomeTax();
				//System.out.println(incomeTaxPayer);
			} //System.out.println("IncomeTaxCollected: " + incomeTaxCollected + ";   "	+ "SalesTaxCollected: " + salesTaxCollected + " from " + foodplace.getName() + "\n----------------------\n");
		}
	}
	
	public String toString() {
		return "TaxCollector: income tax collected: " + incomeTaxCollected + ", sales tax collected: " + salesTaxCollected;
	}
}
