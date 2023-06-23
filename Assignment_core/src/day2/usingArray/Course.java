package day2.usingArray;

public class Course {
    private int courseId;
    private String courseTitle;
    private int courseDuration;
    private String courseProvider;
    private static int counter;
    private float courseCost;

    public Course(int courseId, String courseTitle, int courseDuration, String courseProvider, float courseCost) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseDuration = courseDuration;
        this.courseProvider = courseProvider;
        this.courseCost = courseCost;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public String getCourseProvider() {
        return courseProvider;
    }

    public float getCourseCost() {
        return courseCost;
    }
}
