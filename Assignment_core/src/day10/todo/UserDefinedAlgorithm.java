package day10.todo;

import java.util.Comparator;

public class UserDefinedAlgorithm implements Comparator<Course> {
    @Override
    public int compare(Course course1, Course course2) {
        Float fee1 = course1.getCourseCost();
        Float fee2 = course2.getCourseCost();
        int comparison = fee2.compareTo(fee1);
        return comparison;
    }
}
