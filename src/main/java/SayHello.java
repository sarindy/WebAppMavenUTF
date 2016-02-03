

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SayHello
 */
public class SayHello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SayHello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		
		String customerName=request.getParameter("customerName");
		String prof=request.getParameter("prof");
		String[] location =request.getParameterValues("location");
		
		out.println("<h1>Customer Name is : " + customerName + " </h1><br>");
		out.println("<h1>Customer Job is : " + prof + " </h1><br>");
		out.println("<h1>The Customer can work on : ");
		for (int i=0;i<location.length;i++){
			if (i==0){
				out.println(location[i] + ",");
			}else if (i==location.length-1){
				out.println( location[i] +".");
			}else
			{
				out.println( location[i] +", " );	
			}
			
		}
		
		
		
		
		
		
		
	}

}
