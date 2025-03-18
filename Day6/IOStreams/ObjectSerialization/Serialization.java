package Day6.IOStreams.ObjectSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Hp\\IdeaProjects\\TrainingJava\\src\\cardinfo.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            CardDetails card1 = new CardDetails(12345678989L, "Nexturn", 12, 2023, 567);
            CardDetails card2 = new CardDetails(12345678967L, "Nicmar", 12, 2023, 567);
            oos.writeObject(card1);
            oos.writeObject(card2);
            oos.close();
            fos.close();
            System.out.println("Created");

        }
         catch (IOException e) {
            e.printStackTrace();
        }

    }
}
