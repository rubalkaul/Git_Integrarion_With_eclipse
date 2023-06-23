package day11.todo;

import java.util.ArrayList;
import java.util.Collection;

public class DaoCourseMain {

    public static void getAllCourses(){
        DaoInterface<Course,Integer> daoInterface = new CourseInMemoryDao();
        Collection<Course> list = daoInterface.getAll();
        for (Course course:list) {
            System.out.println(course);
            System.out.println("*************************************************************************************");
        }
    }

    public static void getOneCourseById(Integer id){
        DaoInterface<Course,Integer> daoInterface = new CourseInMemoryDao();
        System.out.println(daoInterface.getOneById(id));
    }

    public static void deleteOneById(Integer id){
        DaoInterface<Course,Integer> daoInterface = new CourseInMemoryDao();
        daoInterface.deleteById(id);
    }

    public static void update(Integer id,Float changedFee){
        DaoInterface<Course,Integer> daoInterface = new CourseInMemoryDao();
        Course course = daoInterface.getOneById(id);
        course.setCourseCost(changedFee);
        daoInterface.update(course);
    }

    public static void createNewCourse(Course newCourse){
        DaoInterface<Course,Integer> daoInterface = new CourseInMemoryDao();
        daoInterface.createNew(newCourse);
    }

    public static void main(String[] args) {
//        getAllCourses();
//        getOneCourseById(101);
//        update(102,45000f);
//        createNewCourse(new Course(200,"Java In hands",102,"Rahul",1000f));
//        getAllCourses();
    }
}
