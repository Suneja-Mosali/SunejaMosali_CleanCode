package q1;

public class SimpleInterest {
	
double IntrestMethod(String CalculationType,double Amount,double NoOfYears,double rateOfIntrest) {
        
        double Si;
		if(CalculationType=="SimpleIntrest")
		{
         Si=(Amount * NoOfYears * rateOfIntrest)/100;
         return Si;
		}
		return 0;

}
}
