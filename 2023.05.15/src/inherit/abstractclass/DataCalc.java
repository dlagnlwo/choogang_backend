package inherit.abstractclass;

//추상클래스 abstract를 포함한 Ab
//DataCalc가 부모가 되는거임.
public class DataCalc extends AbstractCalc{
	//필드
	int x;
	int y;
	int result;
	
	@Override
	public String toString() {
		return 	"x = " + x + ", " + 
				"y = " + y;
	}
}
