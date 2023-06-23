package day2.usingArray;

public class CourseMain1 {
    private static void displayCourse(Course courseRef){
        System.out.println("Course Title:- " + courseRef.getCourseTitle());
        System.out.println("Course ID:- " + courseRef.getCourseId());
        System.out.println("Course Duration:- " + courseRef.getCourseDuration() + " hrs");
        System.out.println("Course Provider:- " + courseRef.getCourseProvider());
        System.out.println("Course Cost:- " + courseRef.getCourseCost());
        System.out.println();
    }
    public static void main(String[] args) {
        Course[] courses = new Course[3];
        courses[0] = new Course(100,"Diploma in Advanced Computing",120,"CDAC Mumbai",90000f);
        courses[1] = new Course(101,"Diploma in Big Data",120,"CDAC Mumbai",100000f);
        courses[2] = new Course(102,"Executive MBA",160,"IIT Roorkee",85000f);

        int length = courses.length,counter = 0;

        //to display all courses.
        for (Course dsp: courses) {
            displayCourse(dsp);
            System.out.println("-----------------------------------------------------------------------------");
        }

        //to find avg cost
        float total=0.0f;
        for (Course dsp:courses) {
            total = total + dsp.getCourseCost();
        }
        System.out.println("Average Fees:- " + total/length);



    }
}
