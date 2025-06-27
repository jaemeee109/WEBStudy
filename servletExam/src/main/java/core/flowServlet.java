package core;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// servlet의 수행 흐름 점검
// 표준 출력 수행 코드만 구현했기 때문에 브라우저에는 아무것도 안나옴


@WebServlet("/flowServlet") //URL 정보
public class flowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //필드
  
    public flowServlet() {
        super();
        // 생성자
    }

	
	public void init(ServletConfig config) throws ServletException {
		// init: 객체가 생성된 다음 호출되는 메서드
		System.out.println("init() 메서드 호출");
	}

	
	public void destroy() {
		// destroy: 객체가 메모리에서 해제될 때 호출되는 메서드
		System.out.println("destroy() 메서드 호출");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// service: 요청방식에 상관없이 항상 호출되는 메서드
		System.out.println("service() 메서드 호출");
	}

}


