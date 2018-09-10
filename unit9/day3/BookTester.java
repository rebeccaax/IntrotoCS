package unit9.day3;

/**
 * Created by rebeccaxu on 4/17/17.
 */
public class BookTester {
    public static void main(String[] args) {
        Book b1 = new Book("Tale of Two Cities", "Charles Dickens", Book.ENGLISH);
        b1.setNumWords(135420);
        b1.setNumPages(448);
        System.out.println("Average words/pages: " + b1.averageWordsPerPage());
        System.out.println(b1);

        Book b2 = new Book ("Don Quixote", "Miguel de Cervantes", Book.SPANISH);
        System.out.println(b2);

        System.out.println(Book.getTotalBooks());
        
    }

}
