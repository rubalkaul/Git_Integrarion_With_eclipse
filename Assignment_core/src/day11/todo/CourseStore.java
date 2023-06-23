package day11.todo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CourseStore {
    private static Map<Integer,Course> allCourses;
    static {
        allCourses = new HashMap<>();
        Course DAC = new Course(100,"Diploma in Advanced Computing",120,"CDAC Mumbai",90000f);
        Course DBDA = new Course(101,"Diploma in Big Data",120,"CDAC Mumbai",100000f);
        Course ExeMBA = new Course(102,"Executive MBA",160,"IIT Roorkee",85000f);
        Course UXdes = new Course(103,"UX Design Mastertrek Certificate",135,"University of Minnesota",72010f);

        allCourses.put(DAC.getCourseId(),DAC);
        allCourses.put(DBDA.getCourseId(),DBDA);
        allCourses.put(ExeMBA.getCourseId(),ExeMBA);
        allCourses.put(UXdes.getCourseId(), UXdes);
    }

    public static void createNewCourse(Course newCourse){
        allCourses.put(newCourse.getCourseId(), newCourse);
    }

    public static Course displayOneById(Integer id){
        return allCourses.get(id);
    }

    public static Collection<Course> displayAll(){
        return allCourses.values();
    }

    public static void updateCourse(Course updatedCourse){
        allCourses.put(updatedCourse.getCourseId(), updatedCourse);
    }

    public static void deleteCourseById(Integer id){
        allCourses.remove(id);
    }
}
