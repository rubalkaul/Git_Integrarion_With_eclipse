package day3;

public class CourseOperation {
    private static boolean x;

    Course[] courses = new Course[4];

    private int counter=0,count=0,noOfCourses = 0;
    public void add(Course course){
        courses[counter++] = course;
    }

    public float getAvgDuration(String providerName){
        for (Course dsp:courses) {
            if(dsp.getCourseProvider().equals(providerName)){
                noOfCourses = noOfCourses + dsp.getCourseDuration();
                count++;
            };
        }
        return (float)(noOfCourses/count);
    }

    public boolean isAvailable(Course incomingCourse){
        for (Course dsp:courses) {
            if(dsp.equals(incomingCourse)){
                x = true;
            };
        }
        return x;
    }

    public void displayCourse(Course courseRef){
        System.out.println("Course Title:- " + courseRef.getCourseTitle());
        System.out.println("Course ID:- " + courseRef.getCourseId());
        System.out.println("Course Duration:- " + courseRef.getCourseDuration() + " hrs");
        System.out.println("Course Provider:- " + courseRef.getCourseProvider());
        System.out.println("Course Cost:- " + courseRef.getCourseCost());
        System.out.println();
    }

    public float getData(Course[] courses){
        for (Course dsp: courses) {
            this.displayCourse(dsp);
            System.out.println("-----------------------------------------------------------------------------");
        }
        return 0.0f;
    }

}
