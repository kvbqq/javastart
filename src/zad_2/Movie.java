package zad_2;

public class Movie extends LibraryItem {
    private String director;
    private  int duration; // in minutes
    private static int moviesCounter = 0;

    public Movie(String title, String director, int duration) {
        super(title);
        this.director = director;
        this.duration = duration;
        moviesCounter++;
    }

    public static int getMoviesCounter() {
        return moviesCounter;
    }

    @Override
    public void displayInfo() {
        System.out.println("Film | Tytuł: " + title + ", Reżyser: " + director + ", Czas trwania: " + duration + " min, Status: " + (isBorrowed ? "Niedostępny" : "Dostępny"));
    }
}
