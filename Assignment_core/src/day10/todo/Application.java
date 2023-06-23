package day10.todo;

import java.util.ArrayList;
import java.util.Collection;

public class Application {
    public static void main(String[] args) {
        Collection<Course> courses = new ArrayList<>();
        courses.add(new Course(100,"Diploma in Advanced Computing",120,"CDAC Mumbai",90000f));
        courses.add(new Course(101,"Diploma in Big Data",120,"CDAC Mumbai",100000f));
        courses.add(new Course(102,"Executive MBA",160,"IIT Roorkee",85000f));
        courses.add(new Course(105,"UX Design Mastertrek Certificate",135,"University of Minnesota",72010f));

        System.out.println("Default sorting - Descending course ID:\n");
        DefaultSortingAlgorithmClass courseComparator = new DefaultSortingAlgorithmClass();
        Collection<Course> courses1 = courseComparator.sortCourses(courses);
        for (Course course:courses1) {
            System.out.println(course);
        }


        System.out.println("\n\nUser defined sorting - Descending Fee:\n");
        UserDefinedSortingAlgorithmClass unsortedCourse = new UserDefinedSortingAlgorithmClass();
        Collection<Course> courses2 = unsortedCourse.sortCourses(courses);
        for (Course course:courses2) {
            System.out.println(course);
        }

    }
}
