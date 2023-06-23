package day12_day14_day15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class CourseDatabaseDao implements DaoInterface<Course, Integer> {

	@Override
	public void createNew(Course newCourse) {
		try{
			Connection newConnection = JdbcUtility.connectMysqlServer();
			String sqlQuery = "insert into course_master(course_ID, course_Title, course_Duration, course_Provider, course_Cost) values(?,?,?,?,?)";
			PreparedStatement pstmt = newConnection.prepareStatement(sqlQuery);
			pstmt.setInt(1, newCourse.getCourseId());
			pstmt.setString(2, newCourse.getCourseTitle());
			pstmt.setInt(3, newCourse.getCourseDuration());
			pstmt.setString(4, newCourse.getCourseProvider());
			pstmt.setFloat(5, newCourse.getCourseCost());
			
			System.out.println(pstmt.executeUpdate() + " record added.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Collection<Course> getAll() {
		Collection<Course> allCourses = new ArrayList<Course>();
		try(
				Connection newConnection = JdbcUtility.connectMysqlServer()
				){
			Statement stmt = newConnection.createStatement();
			String sqlQuery = "select course_ID, course_Title, course_Duration, course_Provider, course_Cost from course_master";
			ResultSet result = stmt.executeQuery(sqlQuery);
			
			while(result.next()) {
				Course course = new Course(result.getInt(1),result.getString(2),result.getInt(3),result.getString(4),result.getFloat(5));
				allCourses.add(course);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return allCourses;
	}

	@Override
	public Course getOneById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Course t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
