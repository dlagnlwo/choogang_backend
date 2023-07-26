package apple.orange.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class EncodingFilter  implements Filter{
	  // private static final Set<String> ALLOWED_PATHS = Collections.unmodifiableSet(new HashSet<>(
		//        Arrays.asList("/js", "/css", "/logout", "/register")));
	/*
	 *  Pattern : 자바에서 정규표현식 객체
	 *  제거하거나 포함하고 있는지를 검사하고 비교할 문자패턴을 등록
	 *  "^.* : "\n" 개행문자를 제외한 모든 문자들
	 *  ^ : 문자열 시작을 의미
	 *  . : "\n" 개행문자를 뺀 모든 문자
	 *  * : 앞의 문자패턴을 여러번 반복하라
	 *  (...) : ()안의 내용을 그룹으로 묶음 분리
	 *  | : or, ()안의 내용들 중에 하나
	 *  $ : 앞의 그룹문자들로 끝나는지 
	 *  / : 시작과 끝을 의미 
	 */
	private static final	Pattern excludeUrls = Pattern.compile(
			"^.*/(css|js|images|ckeditor)/.*$", 
			Pattern.CASE_INSENSITIVE);//CASE_INSENSITIVE:대소문자구분x
	   
	   
	@Override
	public void doFilter
    	(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		///////////////////////////////////////
		
		//필터처리를 위한 요청객체와 응답객체를 웹 프로토콜로 다운캐스팅
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		        //HttpSession session = request.getSession(false);
		// getRequestURI() : 웹브라우저에서 요청한 요청주소 중에서
		// 프로토콜, 서버주소, 포트 번호를 뺀 실제 요청처리에 관련한 나머지 주소
		// ...$ : $로 끝나는 즉 문장의 끝
		// [] : []안의 문자 어떤 것이든 사용할 수 있다.
		// * : 0부터 많음,  문자 또는 숫자등의 수가 제한 없음
		// + : 1부터 많음, 문자 또는 숫자등의 수가 제한 없음
		// [/]+$ : 끝나는 문자가 '/' 문자를 포함 하면
		// 컨텍스트만 남기기 위해서
		String path = req.getRequestURI().substring(req.getContextPath().length())
				.replaceAll("[/]+$", "");

		        	
		// 공통필터 적용
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
	
        // response.setContentType()
		// 허용불가경로 포함여부 판별			
		Matcher matcher = excludeUrls.matcher( path );
		// true or false
		// 포함하면 true 포함하지 않으면 false
		boolean isPathExcluded = matcher.find();
		
		// 허용불가경로가 아니면
		if (!isPathExcluded) {
		   response.setContentType("text/html; charset: UTF-8");
		   System.out.println("허용블가경로 아님 : " + path);
		} else {
		}

		chain.doFilter(request, response); //필터적용
		System.out.println("필터적용완료!");

		///////////////////////////////////////////////
		//동영상은 한글 인코딩 하면 안됨.
        //request.setCharacterEncoding("UTF-8");
		//response.setCharacterEncoding("UTF-8");
		//response.setContentType("text/html; charset=UTF-8");
		//chain.doFilter(request, response);
		 
	}
	
}
