package Day1.Strings;

public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String s1 = "Zamin";

        System.out.println("Length is :" +s1.length());
        System.out.println("Char at :" + s1.charAt(0));
        System.out.println("Substring is :" + s1.substring(0,3));
        System.out.println("Substring is : " + s1.substring(3));
        System.out.println(s1.concat("Nexturn"));



        java.lang.String s2 = "ABCD";

        java.lang.String s3 = "ABCE";

        System.out.println(s2.compareTo(s3));

        System.out.println(s2.replace("A", "X"));
    }
}