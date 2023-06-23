package day8.todo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationOfCourse {

    public static void main(String[] args) {
        String filePath = "./src/day8/ToDo/Assignment.txt";
        try(
                FileInputStream fin = new FileInputStream(filePath);
                ObjectInputStream oin = new ObjectInputStream(fin)
        )
        {
            CourseOperation operate = new CourseOperation();
            int sizeOfArray = operate.courses.length;
            int index;
            Object[] obj = new Object[sizeOfArray];
            System.out.println("Deserialized object are :");
            for (index = 0;index < sizeOfArray;index++) {
                obj[index] = oin.readObject();
                System.out.println(obj[index]);
            }

            Class cls = obj[0].getClass();
            String clsName = cls.getName();
            System.out.println("Class Name..." + clsName);

//            Average Cost
//            float averageCost = 0.0f;
//            for (index = 0;index < sizeOfArray;index++) {
//                averageCost = averageCost + ((Course)obj[index]).getCourseCost();
//            }
//            averageCost = averageCost/sizeOfArray;
//            System.out.println("Your average course cost is: " + averageCost);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
