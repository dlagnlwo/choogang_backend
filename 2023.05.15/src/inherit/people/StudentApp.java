package inherit.people;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student("홍길동",
				"123546-133555",
				1);
		//name, ssn은 상속받은것
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		
		//studentNo는 자기 멤버
		System.out.println("studentNo : " + student.studentNo);
		

	}

}
