package day12_day14_day15;

public class Course {
    private Integer courseId;
    private String courseTitle;
    private Integer courseDuration;
    private String courseProvider;
    private Float courseCost;
    
    

    public Course(Integer courseId, String courseTitle, Integer courseDuration, String courseProvider,
			Float courseCost) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.courseDuration = courseDuration;
		this.courseProvider = courseProvider;
		this.courseCost = courseCost;
	}



	public Integer getCourseId() {
		return courseId;
	}



	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}



	public String getCourseTitle() {
		return courseTitle;
	}



	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}



	public Integer getCourseDuration() {
		return courseDuration;
	}



	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}



	public String getCourseProvider() {
		return courseProvider;
	}



	public void setCourseProvider(String courseProvider) {
		this.courseProvider = courseProvider;
	}



	public Float getCourseCost() {
		return courseCost;
	}



	public void setCourseCost(Float courseCost) {
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
