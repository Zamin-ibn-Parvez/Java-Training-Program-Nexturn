package Day2.Inheritance.Example1;

public class Library extends Student {

    private int booksDue;

    public Library(int regNo, String studentName, String group, int booksDue) {
        super(regNo, studentName, group);
        this.booksDue = booksDue;
    }

    void showDetails() {
        System.out.println(regNo + " "+ stdName+" "+ group+" "+ booksDue);
    }
    public static void main(String[] args) {
        Library library = new Library(10, "Zamin", "IT", 5);
        library.display();
        library.showDetails();

    }


}
