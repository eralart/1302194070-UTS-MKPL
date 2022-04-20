package lib;

public class TahunGabung {
	
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
}