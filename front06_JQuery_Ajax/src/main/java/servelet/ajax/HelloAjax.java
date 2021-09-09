package servelet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloAjax
 */
@WebServlet("/Hello")
public class HelloAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		
		
		/*
		화면으로 받은 데이터를
		디비 연결하는 DAO파일의
		특성 메소드의 인자값으로 연결...
		1) DAO객체를 생성
		2) Member m = DAO.getMemeberByName(name);
		3) Memeber객체 m을 클라이언트로 응답한다. 
		*/
		//코드 실행을 지연시키고 싶을 때..
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		
		
		
		//다시 클라이언트로 응답...
		out.print(name);

}
	}
