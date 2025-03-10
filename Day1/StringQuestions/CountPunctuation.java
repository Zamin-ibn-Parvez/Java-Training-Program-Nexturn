package Day1.StringQuestions;

public class CountPunctuation {
    public static void main(String[] args) {
        String str = "andhbc;,?!!";
        int count =0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            switch (ch){
                case ',':
                    count++;
                    break;
                case '.':
                    count++;
                    break;
                case ';':
                    count++;
                    break;
                case '?':
                    count++;
                    break;
                case '!':
                    count++;
                    break;
                default:
                    break;

            }
        }

        System.out.println("The count of the punctuation marks is : "+ count);
    }
}
