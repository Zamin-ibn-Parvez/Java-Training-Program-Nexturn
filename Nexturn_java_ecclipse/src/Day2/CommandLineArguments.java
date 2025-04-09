package Day2;

public class CommandLineArguments {
    public static void main(String... args) {
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        double Salary = Double.parseDouble(args[2]);

        System.out.println(id +" "+ name +" "+ Salary);
    }
}
