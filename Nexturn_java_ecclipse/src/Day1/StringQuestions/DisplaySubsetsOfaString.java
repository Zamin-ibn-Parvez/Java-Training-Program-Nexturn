package Day1.StringQuestions;

public class DisplaySubsetsOfaString {

    public static void main(String[] args) {
        String str = "Java";

        for(int i=0;i<str.length();i++){
            for(int j = 0; j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }

    }


}
