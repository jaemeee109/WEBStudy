package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestInfo")
public class RequestInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RequestInfo() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String contextPath = request.getContextPath();
		String method = request.getMethod();
		String protocol = request.getRemoteHost();
		String remoteAddr = request.getRemoteAddr();
		String requestURI = request.getRequestURI();
		String requestURL = new String(request.getRequestURL());
		String serverName = request.getServerName();
		String userAgent = request.getHeader("user-agent");
		String referer = request.getHeader("referer");
		String clientMachine = "";
		
		boolean result = Pattern.matches(".*[win16|win32|linux|win64|mac].*", userAgent.toLowerCase());
		
		if(result)
			clientMachine = "PC";
		else 
			clientMachine = "모바일";
		
		String browser = "";
		
		if (userAgent.indexOf("trident") > 0 || userAgent.indexOf("MISE") >0) {
			browser = "IE";
		}else if (userAgent.indexOf("Opera") >0) {
			
		}else if (userAgent.indexOf("Firefox")>0) {
			
		}else if (userAgent.indexOf("Safari")>0) {
			
			if (userAgent.indexOf("Edge")>0) {
				browser = "Chrome";
			}else {
				browser = "Safari";
			}
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h3> 요청 정보를 통해서 추출한 내용 </h3>");
		out.print("<ul>");
		out.print("<li>요정 컨텍스트 패스: " + contextPath + "</li>");
		out.print("<li>요청 방식: "+ method + "</li>");
		out.print("<li>요청 프로토콜: "+ protocol + "</li>");
		out.print("<li>요청 클라이언트 주소: "+ remoteAddr + "</li>");
		out.print("<li>요청 URI: "+ requestURI + "</li>");
		out.print("<li>요청 URL: "+ requestURL + "</li>");
		out.print("<li>요청 서버명: "+ serverName + "</li>");
		out.print("<li>요청 클라이언트 시스템 종류: "+ clientMachine + "</li>");
		out.print("<li>요청 브라우저 종류: "+ browser + "</li>");
		out.print("<li>이 컨텐츠를 요청한 웹 페이지: "+ referer + "</li>");
		out.print("</ul>");
	}

	
	

}
