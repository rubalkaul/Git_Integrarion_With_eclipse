package day5.Assignment;

public class CourseEnrollment {
    private int enrollmentId;
    private String studentName;

    @Override
    public String toString() {
        return "\nEnrollment Id = " + enrollmentId +
                "\nStudent Name = " + studentName +
                "\nCourse Id = " + courseId;
    }

    private int courseId;

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public CourseEnrollment(int enrollmentId, String studentName, int courseId) {
        this.enrollmentId = enrollmentId;
        this.studentName = studentName;
        this.courseId = courseId;
    }
}
