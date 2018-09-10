package unit9.day3;

/**
 * Created by rebeccaxu on 4/17/17.
 */
public class Book {
    public static final String[] LANGUAGES = {"English", "Spanish", "Mandarin", "French"};
    public static final int ENGLISH = 0;
    public static final int SPANISH = 1;
    public static final int MANDARIN = 2;
    public static final int FRENCH = 3;

    private static int totalBooks;

    private String title;
    private String author;
    private int language;
    private int numPages;
    private int numWords;

    public Book (String title, String author, int language) {
        this.title = title;
        this.author = author;
        this.language = language;

        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public double averageWordsPerPage() {
        return (double) numWords / numPages;
    }

    public String toString () {
        return title + " by " + author + " in " + LANGUAGES[language];
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getNumWords() {
        return numWords;
    }

    public void setNumWords(int numWords) {
        this.numWords = numWords;
    }

}
