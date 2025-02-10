package zad_2;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        library.addItem(new Book("Wiedźmin", "Andrzej Sapkowski", 320));
        library.addItem(new Book("Duma i uprzedzenie", "Jane Austen", 432));
        library.addItem(new Movie("Incepcja", "Christopher Nolan", 148));
        library.addItem(new Movie("Gladiator", "Ridley Scott", 155));

        while (true) {
            System.out.println("\nMenu Biblioteki:");
            System.out.println("1. Wyświetl dostępne przedmioty");
            System.out.println("2. Wyświetl wypożyczone przedmioty");
            System.out.println("3. Wypożycz przedmiot");
            System.out.println("4. Zwróć przedmiot");
            System.out.println("5. Pokaż ilość");
            System.out.println("6. Wyjdź");
            System.out.print("\nWybierz opcję: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nDostępne przedmioty:");
                    library.displayItems(false);
                    break;
                case 2:
                    System.out.println("\nWypożyczone przedmioty:");
                    library.displayItems(true);
                    break;
                case 3:
                    System.out.print("\nPodaj tytuł do wypożyczenia: ");
                    String borrowTitle = scanner.nextLine();
                    LibraryItem borrowItem = library.findItem(borrowTitle);
                    if (borrowItem != null) {
                        try {
                            borrowItem.borrowItem();
                            System.out.println("\nWypożyczono: " + borrowTitle);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("\nNie znaleziono przedmiotu.");
                    }
                    break;
                case 4:
                    System.out.print("\nPodaj tytuł do zwrotu: ");
                    String returnTitle = scanner.nextLine();
                    LibraryItem returnItem = library.findItem(returnTitle);
                    if (returnItem != null) {
                        try {
                            returnItem.returnItem();
                            System.out.println("\nZwrócono: " + returnTitle);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("\nNie znaleziono przedmiotu.");
                    }
                    break;
                case 5:
                    System.out.println("\nLiczba książek: " + Book.getBooksCounter());
                    System.out.println("Liczba filmów: " + Movie.getMoviesCounter());
                    break;
                case 6:
                    System.out.println("\nZamykanie programu...");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nNiepoprawny wybór, spróbuj ponownie.");
            }
        }
    }
}
