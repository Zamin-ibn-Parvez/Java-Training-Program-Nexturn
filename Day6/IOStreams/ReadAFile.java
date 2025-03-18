package Day6.IOStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadAFile {

        public static void main (String [] args){
            try{
                FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\IdeaProjects\\TrainingJava\\src\\test.txt");
                int i = fis.read();
                while(i != -1){
                    System.out.print((char)i);
                    i = fis.read();

                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

