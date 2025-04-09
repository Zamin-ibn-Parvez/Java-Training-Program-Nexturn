package Day1.StringQuestions;

public class CountChars {
    public static void main(String[] args) {
        String str = "Zamin Parveez";
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== ' '){
                continue;
            }
            count++;

        }
        System.out.println("The count of the chars is :" + count);


    }
}
