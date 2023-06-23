package day9.todo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CourseUsingCollectionMain {

    Scanner sc = new Scanner(System.in);
    public Course addCourse(){
        try{
//            CourseOperations operations = new CourseOperations();
            System.out.println("Enter course id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter course title : ");
            String title = sc.nextLine();
            System.out.println("Enter course duration : ");
            int duration = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter course provider name : ");
            String provider = sc.nextLine();
            System.out.println("Enter cost of course cost : ");
            float cost = sc.nextFloat();
            Course c = new Course(id,title,duration,provider,cost);
            return c;
//            System.out.println("You have entered following data:\n\n");
//            operations.displayCourse();
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        CourseUsingCollectionMain x = new CourseUsingCollectionMain();
        CourseOperations newOperation = new CourseOperations();
//        Course y = x.addCourse();
        Collection<Course> coursesCollection = new ArrayList<>();
        coursesCollection.add(x.addCourse());
        coursesCollection.add(x.addCourse());
        coursesCollection.add(x.addCourse());
        newOperation.setCourses(coursesCollection);
//        newOperation.getCourses().add(y);
//        Course z = x.addCourse();
//        newOperation.addNewCourse(z);
//        x.addCourse(newOperation);

        newOperation.serialization("./src/day9/todo/AssignmentCourse.txt");
        newOperation.deserialization("./src/day9/todo/AssignmentCourse.txt");


    }
}
