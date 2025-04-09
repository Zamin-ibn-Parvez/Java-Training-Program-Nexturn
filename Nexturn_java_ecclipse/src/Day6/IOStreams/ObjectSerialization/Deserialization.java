package Day6.IOStreams.ObjectSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\IdeaProjects\\TrainingJava\\src\\cardinfo.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            CardDetails card;
            Object obj;

            while((obj=ois.readObject()) !=null){
                card  = (CardDetails) obj;
                System.out.println(card.getCardNumber());
                System.out.println(card.getCvv());
                System.out.println(card.getCardHolderName());
            }
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
