package book;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		ITBook itbook = new ITBook();
		
		System.out.print("책 이름 입력 : ");
		String name = sc.nextLine();
		itbook.setName(name);
		
		System.out.print("저자 입력 : ");
		String author = sc.nextLine();
		itbook.setAuthor(author);
		
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		itbook.setPrice(price);
		
		System.out.print("분야 입력 : ");
		String gemre = sc.next();
		itbook.setGemre(gemre);
		
		System.out.print("출판사 입력 : ");
		String publisher = sc.next();
		itbook.setPublisher(publisher);
		
		
		
		
		System.out.println(itbook.toString());
		
		System.out.println("-------------finish------------");
		

	}

}
