package day3;

public class CourseMain_DAY3 {

    public static void main(String[] args) {
        CourseOperation c = new CourseOperation();
        c.add(new Course(100,"Diploma in Advanced Computing",120,"CDAC Mumbai",90000f));
        c.add(new Course(101,"Diploma in Big Data",120,"CDAC Mumbai",100000f));
        c.add(new Course(102,"Executive MBA",160,"IIT Roorkee",85000f));
        c.add(new Course(103,"UX Design Mastertrek Certificate",135,"University of Minnesota",72010f));

//        CourseOperation c;
////        c.getData(courses);
//
////        c = new CourseCostOperation();
////        System.out.println("Average Cost:- " + c.getData(courses));
//
//        c = new CourseDurationOperation();
//        System.out.println("Average Duration:- " + c.getData(courses) + " hrs");
        System.out.println(c.isAvailable(c.courses[0]));
        System.out.println(c.getAvgDuration("CDAC Mumbai"));

    }
}
