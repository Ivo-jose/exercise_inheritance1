package entities;

public class Individual extends TaxPayer {
	
	//Members of class
	private Double healthExpenditures;
	
	//Constructors
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	//Methods Getters and Setters
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	//Method of class
	@Override
	public double tax() {
		double tax = 0.0;
		if (getAnualIncome()< 20000.00) {
			tax = (getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
		}
		else {
			tax = (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
		}
		return tax;
	}
	@Override
	public String toString() {
		return getName()+": $ "+String.format("%.2f", tax());
	}
}
