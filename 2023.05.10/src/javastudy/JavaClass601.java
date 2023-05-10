package javastudy;


// 자바 601반 룸 - 실행 클래스
class JavaClass601 {
	public static void main(String[] args) {
		//학생 30명의 공간확보
		JavaClass601Student[] jc601 =
				new JavaClass601Student[29];
		jc601[0] = new JavaClass601Student(
				"asd", "서울");
		jc601[1] = new JavaClass601Student(
				"qwe", "경기");
		jc601[2] = new JavaClass601Student(
				"zxc", "경기");
				
		
		System.out.println("jc601[0]학생객체" + 
							jc601[0].toString());
		System.out.println("jc601[1]학생객체" + 
							jc601[1].toString());
		System.out.println("jc601[2]학생객체" + 
							jc601[2].toString());
		
		
		
	}
}
