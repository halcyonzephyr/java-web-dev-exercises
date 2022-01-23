package studios.CH4RestaurantMenu;

import java.util.Date;
import java.util.Objects;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;
    private boolean newness;

    public MenuItem(String name, double price, String description, String category, Date dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.newness = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isNewness() {
        return newness;
    }

    public void setNewness(boolean newness) {
        this.newness = newness;
    }

    public static boolean isNew (MenuItem aMenuItem) {
        if (aMenuItem.newness == true) {
            return true;
        } else {
            return false;
        }
    }
    public void printMenuItem (MenuItem aMenuItem) {
        System.out.println(aMenuItem.name + ": " + aMenuItem.description);
    }

    public boolean equals(MenuItem aMenuItem) {
        if (this == aMenuItem) return true;
        if (aMenuItem == null || getClass() != aMenuItem.getClass()) return false;
        MenuItem menuItem = (MenuItem) aMenuItem;
        return Double.compare(menuItem.price, price) == 0 && newness == menuItem.newness && Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category) && Objects.equals(dateAdded, menuItem.dateAdded);
    }
}