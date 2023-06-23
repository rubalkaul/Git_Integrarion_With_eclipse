package day7.todo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadAndCopy {
    public static void main(String[] args) {
        String pathSource = args[0];
        String pathDestination = args[1];
        try(

                InputStream finput = new FileInputStream(pathSource);
                OutputStream foutput = new FileOutputStream(pathDestination)

           )
        {
            StringBuilder stringType = new StringBuilder();
            while (true){
                int data = finput.read();
                if(data == -1){
                    break;
                }
                stringType.append((char)data);
            }
            String newString = stringType.toString();
            byte dataInBytes[] = newString.getBytes();
            foutput.write(dataInBytes);
            System.out.println("Data copied successfully!");
        }
        catch(FileNotFoundException e){
            System.out.println("File does not found!");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
