package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/queryGet")
public class queryGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("guestName");
		String numStr = request.getParameter("num");

		if (userName == null || numStr == null || numStr.isEmpty()) {
			out.print("<h3 style='color:red;'>잘못된 요청입니다. 이름과 숫자를 모두 입력해주세요.</h3>");
			out.print("<a href='" + request.getHeader("referer") + "'>입력 화면으로 돌아가기</a>");
			out.close();
			return;
		}

		int number = Integer.parseInt(numStr);

		out.print("<h2>요청 방식: " + request.getMethod() + "</h2>");
		out.print("<h2>요청 URI: " + request.getRequestURI() + "</h2>");
		out.print("<h2>당신의 이름은: " + userName + " 이군요 </h2>");
		out.print("<h2>당신이 좋아하는 숫자는: " + number + " 이군요</h2>");
		out.print("<a href='" + request.getHeader("referer") + "'>입력 화면으로 가기</a>");
		out.close();
	}
}
