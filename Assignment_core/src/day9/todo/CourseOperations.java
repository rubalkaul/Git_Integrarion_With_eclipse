package day9.todo;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

public class CourseOperations {
    private Collection<Course> courses;

    public Collection<Course> getCourses() {
        return courses;
    }

    public void setCourses(Collection<Course> courses) {
        this.courses = courses;
    }

    public void addNewCourse(Course course){
        courses.add(course);
    }

    public void serialization(String path){
        String filePath = path;

        try(
                FileOutputStream fout = new FileOutputStream(filePath);
                ObjectOutputStream oout = new ObjectOutputStream(fout)
        ){
//            for (Course course: courses) {
                oout.writeObject(courses);
//            }
            System.out.println("Object serialized successfully.");
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void deserialization(String path){
        String filePath = path;
        try(
                FileInputStream fin = new FileInputStream(filePath);
                ObjectInputStream oin = new ObjectInputStream(fin)
        )
        {
            int size = courses.size();
            int index;
            Object[] obj = new Object[size];
            System.out.println("Deserialized object are :");
//            Collection<Object> object = new ArrayList<>();

            for (Object object:obj) {

                object = oin.readObject();

                System.out.println(object);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}
