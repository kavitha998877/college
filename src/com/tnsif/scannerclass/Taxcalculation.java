package com.tnsif.scannerclass;

public class Taxcalculation {
	public void CalculateTax(Person p) {
		if(p.getIncome()<=1600) {
			p.getTax();
	}
	else if(p.getIncome()>1600&&p.getIncome()<30000)  {
		p.setTax(5); 
	}
	else {
         p.setTax(10);
			
		} 
}
}
