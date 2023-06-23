package day8.todo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CourseMain {
    public static void main(String[] args) {
        CourseOperation operate = new CourseOperation();
        String path = "./src/day8/ToDo/Assignment.txt";
        try(
                Scanner sc = new Scanner(System.in);
                FileOutputStream fOut = new FileOutputStream(path);
                ObjectOutputStream oOut = new ObjectOutputStream(fOut)
                )
        {
            for (int index = 0;index < operate.courses.length;index++){
                System.out.println("Enter course id : ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter course title : ");
                String title = sc.nextLine();
                System.out.println("Enter course duration : ");
                int duration = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter course provider name : ");
                String provider = sc.nextLine();
                System.out.println("Enter cost of course cost : ");
                float cost = sc.nextFloat();
                operate.add(new Course(id,title,duration,provider,cost));
            }
            for (int index = 0;index < operate.courses.length;index++){
                oOut.writeObject(operate.courses[index]);
            }

            System.out.println("Serialization Successful!!!");

            }
        catch (IOException ex) {
            System.out.println("File not found!");
            ex.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
