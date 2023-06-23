package day10.todo;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class DefaultSortingAlgorithmClass implements CourseDataSorter {

    @Override
    public Collection<Course> sortCourses(Collection<Course> courseCollection) {
        SortedSet<Course> sortedSet = new TreeSet<>(courseCollection);
            sortedSet.addAll(courseCollection);
        return sortedSet;
    }
}
