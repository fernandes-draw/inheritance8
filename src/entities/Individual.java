package entities;

public class Individual extends TaxPayer {

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
	public double tax() {
		if (anualIncome < 20000.00) {
			return (getAnualIncome() * 0.15) - (getHealthExpenditures() * .50);
		} else {
			return (getAnualIncome() * .25) - (getHealthExpenditures() * .50);
		}
	}

}
