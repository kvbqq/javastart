package zad_2;

public class Book extends LibraryItem {
    private String author;
    private int pages;
    private static int booksCounter = 0;

    public Book(String title, String author, int pages) {
        super(title);
        this.author = author;
        this.pages = pages;
        booksCounter++;
    }

    public static int getBooksCounter() {
        return booksCounter;
    }

    @Override
    public void displayInfo() {
        System.out.println("Książka | Tytuł: " + title + ", Autor: " + author + ", Liczba stron: " + pages + ", Status: " + (isBorrowed ? "Niedostępna" : "Dostępna"));
    }
}
