package day12_day14_day15;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/course")
public class CourseServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String title = request.getParameter("title");
		String provider = request.getParameter("provider");
		int duration = Integer.parseInt(request.getParameter("duration"));
		float cost = Float.parseFloat(request.getParameter("cost"));
		int id = Integer.parseInt(request.getParameter("id"));
		
		Course newCourse = new Course(id, title, duration, provider, cost);
		CourseDatabaseDao courseDb = new CourseDatabaseDao();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		courseDb.createNew(newCourse);
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("Show_Courses.html");
		dispatcher.include(request, response);
	}
}

