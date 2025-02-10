package zad_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayItems(boolean borrowed) {
        for (LibraryItem item : items) {
            if (item.isBorrowed() == borrowed) {
                item.displayInfo();
            }
        }
    }

    public LibraryItem findItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }
}
