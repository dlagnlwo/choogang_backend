package javastudy;

	// 우리 학생 - 데이터 클래스
class JavaClass601Student {
	//필드
	String studentName;
	String studentAddress; //객체변수 = 인스턴스변수
	static String javaClassName; //정적변수
	
	
		
	//생성자
	//static 멤버변수 초기화
	private JavaClass601Student(String javaClassName) {
		//정적멤버는 클래스명.정적멤버변수로 접근
		//this.java~ 아님.
		JavaClass601Student.javaClassName = javaClassName;
	}
	// 등교하면 비콘 찍는 생성자
	// 학생이름과 주소가 없는 null데이터가 생기면 안되므로
	// 학생이름 학생주소를 전달하는 매개변수가 필요.
	JavaClass601Student(String studentName, 
						String studentAddress) {
		this("자바/스프링 과정 601호"); //생성자 오버로딩 메소드 호출방법
		this.studentAddress = studentAddress;
		this.studentName = studentName;
		System.out.printf("%s이 지금 등교했습니다.\n", this.studentName);

	}
		//이 클래스를 설명해주는 메소드 toString() 오버라이딩
		@Override
		public String toString() {
			return "[학생이름 : " + studentName + "\t" +
					"학생주소 : " + studentAddress + "]";
		}
	
}

