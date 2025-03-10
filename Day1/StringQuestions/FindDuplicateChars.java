package Day1.StringQuestions;

public class FindDuplicateChars {

    public static void main(String[] args) {
        String str = "abacdebf";

        for(int i=0;i<str.length();i++){
            for(int j =i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println("The duplicate character is :"+str.charAt(i));
                }
            }
        }
    }


}
