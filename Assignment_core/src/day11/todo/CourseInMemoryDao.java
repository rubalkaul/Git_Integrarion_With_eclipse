package day11.todo;

import java.util.Collection;

public class CourseInMemoryDao implements DaoInterface<Course,Integer>{
    @Override
    public void createNew(Course course) {
        CourseStore.createNewCourse(course);
    }

    @Override
    public Collection<Course> getAll() {
        return CourseStore.displayAll();
    }

    @Override
    public Course getOneById(Integer id) {
        return CourseStore.displayOneById(id);
    }

    @Override
    public void update(Course course) {
        CourseStore.updateCourse(course);
    }

    @Override
    public void deleteById(Integer id) {
        CourseStore.deleteCourseById(id);
    }
}
