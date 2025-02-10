package zad_2;

abstract class LibraryItem {
    protected String title;
    protected boolean isBorrowed;

    public LibraryItem(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowItem() throws Exception {
        if (isBorrowed) {
            throw new Exception("Nie można wypożyczyć wybranego przedmiotu, ponieważ jest on już wypożyczony");
        }
        isBorrowed = true;
    }

    public void returnItem() throws Exception {
        if (!isBorrowed) {
            throw new Exception("Nie można zwrócić wybranego przedmiotu, ponieważ nie jest on wypożyczony");
        }
        isBorrowed = false;
    }

    public abstract void displayInfo();
}
