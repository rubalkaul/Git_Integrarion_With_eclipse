package day3;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return getCourseId() == course.getCourseId() && getCourseDuration() == course.getCourseDuration() && Float.compare(course.getCourseCost(), getCourseCost()) == 0 && Objects.equals(getCourseTitle(), course.getCourseTitle()) && Objects.equals(getCourseProvider(), course.getCourseProvider());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseId(), getCourseTitle(), getCourseDuration(), getCourseProvider(), getCourseCost());
    }
}
