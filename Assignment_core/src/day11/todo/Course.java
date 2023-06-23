package day11.todo;

public class Course {
    private int courseId;
    private String courseTitle;
    private int courseDuration;
    private String courseProvider;
    private float courseCost;

    public Course(int courseId, String courseTitle, int courseDuration, String courseProvider, float courseCost) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseDuration = courseDuration;
        this.courseProvider = courseProvider;
        this.courseCost = courseCost;
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

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setCourseProvider(String courseProvider) {
        this.courseProvider = courseProvider;
    }

    public void setCourseCost(float courseCost) {
        this.courseCost = courseCost;
    }

    @Override
    public String toString() {
        return "Course Id:- " + courseId +
                "\nCourse Title:- " + courseTitle  +
                "\nCourse Duration:- " + courseDuration +
                "\nCourse Provider:- " + courseProvider +
                "\nCourse Cost:- " + courseCost;
    }
}
