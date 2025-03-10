package Day1.StringQuestions;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String str1 = "aaa";
        System.out.println("String 1 is :" + str1);
        String str2 = "bb";
        System.out.println("String 2 is :"+str2);
        String temp ="";
        temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println("After Swapping:");
        System.out.println("String 1 is :" + str1);
        System.out.println("String 2 is :" + str2);


    }


}
