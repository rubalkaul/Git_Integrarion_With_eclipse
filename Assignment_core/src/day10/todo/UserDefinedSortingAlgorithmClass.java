package day10.todo;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class UserDefinedSortingAlgorithmClass implements CourseDataSorter {

    @Override
    public Collection<Course> sortCourses(Collection<Course> courseCollection) {
        Comparator<Course> courseComparator = new UserDefinedAlgorithm();
        SortedSet<Course> sortedSet = new TreeSet<>(courseComparator);
        sortedSet.addAll(courseCollection);
        return sortedSet;
    }
}
