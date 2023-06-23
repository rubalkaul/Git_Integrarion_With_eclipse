package day2.usingStatic;

public class CourseMain {
    public static void main(String[] args) {
        CourseProcessor c1 = new CourseProcessor();
        c1.create(101,"Diploma in Big Data",120,"CDAC Mumbai",100f);
        float a = c1.getCost();
        CourseProcessor c2 = new CourseProcessor();
        c2.create(100,"Diploma in Advanced Computing",120,"CDAC Mumbai",900f);
        float b = c2.getCost();

        System.out.println((a + b)/c2.getCounter());
    }
}
