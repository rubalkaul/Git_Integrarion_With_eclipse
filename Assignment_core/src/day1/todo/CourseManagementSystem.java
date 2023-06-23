package day1.todo;

public class CourseManagementSystem {
      public static void printCourseDetails(Course courseRef){
          System.out.println("Course Title:- " + courseRef.getCourseTitle());
          System.out.println("Course ID:- " + courseRef.getCourseId());
          System.out.println("Course Duration:- " + courseRef.getCourseDuration() + " hrs");
          System.out.println("Course Provider:- " + courseRef.getCourseProvider());
          System.out.println("Course Cost:- " + courseRef.getCourseCost());
          System.out.println();
      }

    public static void main(String[] args) {

        Course DAC = new Course(100,"Diploma in Advanced Computing",120,"CDAC Mumbai",90000f);
//        printCourseDetails(DAC);
        System.out.println(DAC.toString());//using toString() method.
        System.out.println("---------------------------------------------------------------------------------------");


        Course DBDA = new Course(101,"Diploma in Big Data",120,"CDAC Mumbai",100000f);
//        printCourseDetails(DBDA);
        System.out.println(DBDA.toString());//using toString() method.
        System.out.println("---------------------------------------------------------------------------------------");


        Course ExeMBA = new Course(102,"Executive MBA",160,"IIT Roorkee",85000f);
//        printCourseDetails(ExeMBA);
        System.out.println(ExeMBA.toString());//using toString() method.
        System.out.println("---------------------------------------------------------------------------------------");


        Course UXdes = new Course(103,"UX Design Mastertrek Certificate",135,"University of Minnesota",72010f);
//        printCourseDetails(UXdes);
        System.out.println(UXdes.toString());//using toString() method.
        System.out.println("---------------------------------------------------------------------------------------");
    }
}
