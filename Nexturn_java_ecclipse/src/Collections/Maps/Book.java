package Collections.Maps;

import java.util.Map.Entry;

import java.util.*;

public class Book {
    private int bookId;
    private String bookName;

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(1, "Java"));
        bookList.add(new Book(2, "Python"));
        bookList.add(new Book(3, "C++"));
        bookList.add(new Book(4, "C#"));
        System.out.println(bookList);

        HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();
        for (Book book : bookList) {
            bookMap.put(book.getBookId(), book);
        }

        // Print the HashMap
        Set<Entry<Integer, Book>> entries =bookMap.entrySet();  //Returns the base address of the map as a set of entries.
        Iterator<Entry<Integer, Book>> itr = entries.iterator();

        while(itr.hasNext()){
            Entry<Integer,Book > entry = itr.next(); //Returns the next element in the iteration>
            System.out.println("key : "+ entry.getKey()+ " "+ "Value : " + entry.getValue());
        }



    }
}
