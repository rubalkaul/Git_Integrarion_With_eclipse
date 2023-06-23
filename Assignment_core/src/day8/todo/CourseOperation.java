package day8.todo;

public class CourseOperation {
    Course[] courses = new Course[3];
    int counter = 0;
    public void add(Course course){
        courses[counter++]=course;
    }

}
