package inherit.myinterface;

public class CalcApp {

	public static void main(String[] args) {
		Ccalc calc = new Ccalc();
		
		double retVal = calc.add(100.0, 200.0);
		System.out.println(retVal);
		
		calc.p("retVal = ");
		calc.pl("" + retVal);
		
		ICalc icalc = new Ccalc();
		retVal = icalc.sub(100.0, 50.0);
		System.out.println("retVal = " + retVal);
		
		

	}

}
