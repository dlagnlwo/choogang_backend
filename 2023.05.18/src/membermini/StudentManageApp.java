package membermini;

import java.util.*;

public class StudentManageApp {

	public static void main(String[] args) {
		// 제네릭 : 
		// 자바에는 자료를 보관하는 여러가지 방법이 있습니다.
		// 그 방법중에서 데이터형식에 자료형식을 표시하는 방법중에
		// 배열과 유사한 기능을 가지는
		// ArrayList<데이터형> 변수명과 같이 사용형식을 리스트라고 합니다.
		// 실제로 사용할 때는 더욱 편리합니다.
		// ArrayList<데이터형>의 뜻은
		// ArrayList리스트에 저장되는 타입이 데이터형식의 값
		// 게시판을 만들때 가장 많이 사용할 문구
		ArrayList<Student> list = new ArrayList<>();
		pl("list의 크기 : " + list.size());
		Scanner sc = new Scanner(System.in);
		
		pl(">>>>>>> 중앙 자바 601호반 학생 관리 프로그램<<<<<<<");
		pl("#########################################");
		int menu = 0;
		
		//하드코딩 하면 안됨.
		//true값을 isRun변수에 저장 시킴.
		boolean isRun = true;
		
		while(isRun) {
			try {
				p("1. 입력 \t 2. 출력 \t 3. 마침 \t 4. 삭제 \t");
				p("실행할 메뉴 선택 >> ");
				menu = sc.nextInt(); 
				
				switch(menu) {
				case 1 :
					pl("1번메뉴를 선택했습니다.");
					Student st = new Student();
					p("학생 번호 : ");
					st.setId(sc.nextInt());
					p("학생 이름 : ");
					st.setName(sc.next());
					p("학생 나이 : ");
					st.setAge(sc.nextInt());
					p("국어 성적 : ");
					st.setKor(sc.nextInt());
					p("영어 성적 : ");
					st.setEng(sc.nextInt());
					p("수학 성적 : ");
					st.setMath(sc.nextInt());
					
					//list에 student 추가
					//저 위에 입력을 다 하면 한 배열에 저장이 됨.
					list.add(st);
					
					continue;
				case 2 :
					pl("학생크기 : " + list.size());
					//리스트에 자료가 없는 경우
					//.size() 꼭 기억하자
					if(list.size() == 0) {
						pl("리스트에 자료가 없습니다.");
					}else {
					//리스트에 자료가 있는 경우
						for(int i = 0; i < list.size(); i++) {
							//i번째 요소 출력 --> list.get(i)
							pl(list.get(i).toString());
						}
					}
					
					break;
					
				case 3 : 
					pl("프로그램을 종료합니다.");
					isRun = false; //while문은 종료(빠져나감)
					break;
				case 4 :
					String msg = "";
					p("리스트를 삭제하시겠습니까? (Y / N) : ");
					msg = sc.next();
					if(msg.equals("Y") || msg.equals("y")) {
						list.clear();
						pl("리스트를 삭제했습니다.");
						pl("프로그램 종료");
					}else if(msg.equals("N") || msg.equals("n")){
						pl("'N'을 눌렀습니다.");
						break;
					}
					
					isRun = false;
				default :
					break;
				}
			}catch(Exception e) {
				pl("다시입력해주세요.");
				continue;
			}
		}
		
		

	}
	public static void p(String msg) {
		System.out.print(msg);
	}
	public static void pl(String msg) {
		System.out.println(msg);
	}
}
