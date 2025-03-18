package Day6.IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToAFile {
    public static void main (String [] args){
        try{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Hp\\IdeaProjects\\TrainingJava\\src\\test.txt");
        for(int i=65; i<=90;i++) {

            fos.write(i);
        }
            fos.close();
            System.out.println("File has been created");
        }
             catch (IOException e) {
                e.printStackTrace();
            }
    }

}
