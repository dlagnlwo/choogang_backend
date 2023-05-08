package human;

public class Na extends Human {// extends Human

	// 필드
	double height, weight;
	char gender;
	String name, tel;

	// 생성자
	// 생성자 = 필드값을 초기화하기위한 용도
	private Na() {
		this.height = 150;
		this.weight = 50;
		this.gender = '남';
		this.name = "";
		this.tel = "";
	}

	// 필수필드
	Na(String name, String tel) {
		this();
		this.name = name;
		this.tel = tel;
	}

	// 모든필드
	Na(String name, String tel, double height, double weight, char gender) {
		this.name = name;
		this.tel = tel;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	void setHeight(double height) {
		this.height = height;
	}

	double getHeight() {
		return this.height;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	double getWeight() {
		return this.weight;
	}

	void setGender(char gender) {
		this.gender = gender;
	}

	char getGender() {
		return this.gender;
	}

	
	// 메소드 오버로딩은 같은 이름의 메소드 안에 매개변수가 다르면 됨.
	// 선택항목 멤버정보
	private void printInfo(boolean isPrint) {
		if (isPrint) {
			System.out.println("키 : " + this.getHeight());
			System.out.println("몸무게 : " + this.getWeight());
			System.out.println("성별 : " + this.getGender());
		}

	}

	public void printInfo() {
		//필수항목 멤버정보
		//true면 저 위에 printInfo가 나오고
		//false면 저 위에 printInfo가 안나옴.
		printInfo(false);
		System.out.printf("나의 이름 %s \n", this.getName());
		System.out.printf("나의 전화번호 %s", this.getTel());
	}

}
