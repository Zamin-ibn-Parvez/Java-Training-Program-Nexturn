package Day1.StringQuestions;

import java.util.Scanner;
//
//public class FindDuplicateChars {
//
//    public static void main(String[] args) {
//        String str = "abacdebaaaabbbf";
//        int count =0;
//
//        for(int i=0;i<str.length();i++){
//            for(int j =i+1;j<str.length();j++){
//                if(str.charAt(i)==str.charAt(j)){
//                    System.out.println("The duplicate character is :"+str.charAt(i));
//                    count++;
//                    if(count>1){
//
//                    }
//                }
//            }
//        }
//    }
//
//
//}


import java.util.Scanner;

public class FindDuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String seen = ""; // A string to track seen characters
        String duplicates = ""; // A string to store duplicate characters

        for (char ch : sentence.toCharArray()){
            if(seen.indexOf(ch)==-1){
                seen+=ch;  //if the character is not present in the seen string then add it into the string
            }
            else{
                if(duplicates.indexOf(ch)!=-1){
                    //Check if the character ids already present int the string then do nothing
                }

                else{
                    duplicates+=ch;  //Put the character in inside the duplicate string
                }

            }

        }

        // Print the duplicate characters
        System.out.println("Duplicate characters are: " + duplicates);
        System.out.println(seen);
    }
}


