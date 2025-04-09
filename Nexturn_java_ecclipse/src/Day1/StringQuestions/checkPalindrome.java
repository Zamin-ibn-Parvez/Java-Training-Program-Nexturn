package Day1.StringQuestions;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be checked");

        String str = sc.nextLine();

     StringBuilder reversed = new StringBuilder();

     reversed.append(str);
     reversed.reverse();

     if(str.equalsIgnoreCase(reversed.toString())){
         System.out.println("The String is a palindrome");
     }
     else{
         System.out.println("The String is not a palindrome");
     }



    }

}
