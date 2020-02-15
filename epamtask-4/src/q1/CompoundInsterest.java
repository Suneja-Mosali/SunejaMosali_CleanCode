package q1;

public class CompoundInsterest {

double IntrestMethod(String CalculationType,double Amount,double NoOfYears,double rateOfIntrest) {
        
        double Ci;
        
        if(CalculationType=="CompoundInsterest")
		{
         Ci=Amount * Math.pow(1.0+rateOfIntrest/100.0,NoOfYears) - Amount;
         return Ci;
		}
        
        return 0;
}
	
}
