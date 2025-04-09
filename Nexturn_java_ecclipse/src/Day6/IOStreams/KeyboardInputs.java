package Day6.IOStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputs {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter code and name and salary");
        int code = Integer.parseInt(br.readLine());
        String name = br.readLine();
        double salary = Double.parseDouble(br.readLine());
        System.out.println(code +" "+ name +" "+ salary);

    }
}
