package servelet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;





import domain.Weather;

/**
 * Servlet implementation class JsonServlet
 */
@WebServlet("/JsonServlet")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//1. JSON객체를 하나 생성...json.jar 가 있어야 한다.
		//비동기 통신에서 응답하는 데이터 타입을 객체로 할 때 json타입을 쓴다.  
		JSONObject json = new JSONObject();
		
		/*
		 * json.put("region", "Busan"); json.put("wind", 34); json.put("temp",27);
		 * json.put("rain", 10);
		 */
		//응답한다.. 객체를 응답한다. 
		
		
		
		//2. Weather 객체를 생성
		Weather weather = new Weather("NY",44,23,78);
	
	
		json.put("weather",weather);
		
		out.print(json);
	}

}
