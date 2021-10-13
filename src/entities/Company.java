package entities;

public class Company extends TaxPayer {

	//Members of class
	private Integer numberOfEmplyees;
	
	//Contructors
	public Company() {
		super();
	}
	
	 public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		 super(name, anualIncome);
		 this.numberOfEmplyees = numberOfEmployees;
	}
	 
	//Methods Getters and Setters
	public Integer getNumberOfEmplyees() {
		return numberOfEmplyees;
	}

	public void setNumberOfEmplyees(Integer numberOfEmplyees) {
		this.numberOfEmplyees = numberOfEmplyees;
	}
	@Override
	public double tax() {
		double tax = 0.0;
		if (numberOfEmplyees <= 10) {
			tax = getAnualIncome() * 0.16;
		}
		else {
			tax = getAnualIncome() * 0.14;
		}
	 	return tax;	
	}
	
	@Override
	public String toString() {
		return getName()+": $ "+ String.format("%.2f", tax());
	}
	 
	 
}
