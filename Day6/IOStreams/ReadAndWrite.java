package Day6.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
    public static void main (String [] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\IdeaProjects\\TrainingJava\\src\\test.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Hp\\IdeaProjects\\TrainingJava\\src\\test2.txt");
            int i = fis.read();
            while(i != -1){
                System.out.print((char)i);
                fos.write(i);
                i = fis.read();

            }
            fis.close();
            fos.close();
            System.out.println("Data has been copied to test2");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    }





