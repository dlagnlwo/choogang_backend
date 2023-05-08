package calculator;

public class CalcMain {

	public static void main(String[] args) {
		Calculator Calc = new Calculator(5, 2);

		int[] calculate = new int[4];
		
		

		for (int i = 0; i < calculate.length; i++) {
			int a = Calc.getRetCalc()[i];
			char c = Calc.getSign()[i];
			System.out.println("x " + Calc.getSign()[i] + " y" + 
			" =" + Calc.getRetCalc()[i]);
		}
		

		System.out.println(Calc.toString());

	}

}
