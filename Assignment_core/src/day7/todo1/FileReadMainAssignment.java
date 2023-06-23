package day7.todo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadMainAssignment {

    public static void main(String[] args) {
        String path = args[0];
        InputStream fInput = null;
        try {
            StringBuilder handledString = new StringBuilder();
            fInput = new FileInputStream(path);
            while (true){
                int data = fInput.read();
                if(data == -1){
                    break;
                }
                char ch = (char)data;
                handledString.append(ch);
            }
            System.out.print(handledString.reverse());
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        finally {
            try {
                fInput.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
