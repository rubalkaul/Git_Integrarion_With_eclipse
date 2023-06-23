package day3;

public class CourseCostOperation extends CourseOperation{

    public float averageCost;

    public float getData(Course[] courses){
        int length = courses.length;
        float total=0.0f;
        for (Course dsp:courses) {
            total = total + dsp.getCourseCost();
        }
        averageCost = (total/length);
        return averageCost;
    }

}
