package Day1.Strings;

public class StringBuilderMutableString {

    public static void main (String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("Java"));

        sb.append("is very easy");
        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

    }
}

