package membermini;

import java.util.*;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		ArrayList<Student> list = new ArrayList<>();
		pl(">>>>>중앙자바클래스 학생관리 프로그램<<<<<");
		
		int menu = 0;
		
		
		boolean isRun = true;
		//while루프는 변수에 담아서 써라
		while(isRun) {
			try {
				pl("1. 입력 \t 2. 출력 \t 3. 종료 \t 4.삭제");
				p("번호 입력 : ");
				menu = sc.nextInt();
				if(menu == 1) {
					
					pl("학생정보를 입력해주세요 : ");
					p("학생번호 : ");
					int id = sc.nextInt();
					st.setId(id);
					p("학생나이 : ");
					int age = sc.nextInt();
					st.setAge(age);
					p("학생이름 : ");
					String name = sc.next();
					st.setName(name);
					p("국어점수 : ");
					int kor = sc.nextInt();
					st.setKor(kor);
					p("영어점수 : ");
					int eng = sc.nextInt();
					st.setEng(eng);
					p("수학점수 : ");
					int math = sc.nextInt();
					st.setMath(math);
					
					
					list.add(st);
					continue;
					
				}else if(menu == 2) {
					pl("[1. 학생정보]");
					pl("이름 : " + st.getName());
					pl("번호 : " + st.getId());
					pl("나이 : " + st.getAge());
					pl("국어점수 : " + st.getKor());
					pl("영어점수 : " + st.getEng());
					pl("수학점수 : " + st.getMath());
					pl("-------------------------");
					pl("총점 : " + st.sum());
					pl("평균 : " + st.avg());
					
					pl("학생 ArrayList크기 : " + list.size());
					
					//리스트가 없는 경우
					if(list.size() == 0) {
						pl("리스트에 자료가 없습니다.");
					}else {
						//리스트가 있는 경우
						for(int i = 0; i < list.size(); i++) {
							//list.get(i) --> 리스트의 i번째 출력
							//.toString() --> pl이 String이기
							//때문에 String값으로 바꿔서 출력해야함.
							pl(list.get(i).toString());
						}
					}
					
					continue;
				}else if(menu == 3) {
					pl("종료합니다.");
					isRun = false;
					break;
				}else if(menu == 4) {
					
				}else {
					pl("다시 입력(1~4)");
					continue;
				}
			}catch(Exception e) {
				pl("숫자 1~4까지 입력해주세요.");
				pl(e.toString());
				isRun = false;
				break;
			}
		}
	pl("--------finish---------");
	}
	
	
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}
}
