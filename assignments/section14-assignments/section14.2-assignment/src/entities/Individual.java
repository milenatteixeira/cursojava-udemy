package entities;

public class Individual extends TaxPayer{
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {
		Double taxValue = 0.0;
		Double healthValue = 0.0;
		
		if(getAnualIncome()<20000.00) {
			taxValue = 0.15;
		}else if(getAnualIncome()>=20000.00) {
			taxValue = 0.25;
		}
		
		if(healthExpenditures!=null && healthExpenditures>0) {
			healthValue = healthExpenditures * 0.5;
		}
		
		return getAnualIncome() * taxValue - healthValue;
	}
}
