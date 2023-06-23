package day7.todo1;

import java.io.*;

public class FileReadAndCopyUsingBuffer {
    public static void main(String[] args) {
        String source = "./src/Copied.txt";
        String destination = "./src/day7/CopiedKaCopy.txt";
        File currentFile = new File(source);
        boolean availability = currentFile.exists();

        if(availability){
            try(
                    FileInputStream fInput = new FileInputStream(currentFile);
                    BufferedInputStream bInput = new BufferedInputStream(fInput);
                    FileOutputStream fOutput = new FileOutputStream(destination);
                    BufferedOutputStream bOutput = new BufferedOutputStream(fOutput)
                    )
            {
                int fileSize = (int)currentFile.length();
                byte byteData[] = new byte[fileSize];
                bInput.read(byteData);//converts the data consists in file to byte array.
                bOutput.write(byteData);//converts the data to txt format from byte array.
                System.out.println("File Copied Successfully!!!");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
