package day3;

public class CourseDurationOperation extends CourseOperation {
    public float averageDuration;

    public float getData(Course[] courses){
        int length = courses.length;
        float total=0.0f;
        for (Course dsp:courses) {
            total = total + dsp.getCourseDuration();
        }
        averageDuration = (total/length);
        return averageDuration;
    }

}
