
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        
        
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            Integer age = Integer.valueOf(scanner.nextLine());
            
            list.add(new Book(input,age));         
        }
        
        System.out.println(list.size() + " books in total.");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book:: getAge)
                .thenComparing(Book:: getName);
        
        Collections.sort(list, comparator);
        
        System.out.println("Books: ");
        for (Book book: list) {
            System.out.println(book);
        }
    }

}
