package problems;

public class RegularEmployee extends Employee {

	public RegularEmployee(double earning) {
		
		super(earning);
		
	}
	
@Override
	
public double calculateIncomeTax() {
	double taxAmount =0;
	
	if (earning > 50000 && earning <= 60000)
	{
		taxAmount=(earning - 5000)* 0.1;
		
	}
	else if (earning >60000 && earning <= 150000)
	{
	    taxAmount = 10000 + ( earning - 60000)* 0.2;
	    
	}
	else if (earning > 150000)
	{
		taxAmount = 10000 + 18000 + (earning -150000)* 0.3;
	}
	return taxAmount;
}
}
