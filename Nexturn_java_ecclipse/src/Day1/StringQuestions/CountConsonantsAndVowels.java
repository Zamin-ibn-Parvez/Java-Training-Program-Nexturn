package Day1.StringQuestions;

public class CountConsonantsAndVowels {
    public static void main(String[] args) {
        String str = "Zamin Parveez Bhat";

        int count =0;

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' ' ){
                continue;
            }
            else{
                count++;
            }
        }

        System.out.println("The count of vowels and Consonants is :" + count);

    }


}


//1.display subsets of a string
//j
//ja
//        jav
//java
//display every char of a string omn a separate line
//find duplicate chars in a given string
//Check palindrome(using reverse method
//Swap two strings
//s1 ="aaa" and s2 ="bb"