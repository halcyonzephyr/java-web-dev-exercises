package studios.CH4RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items, Date lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> addMenuItem (MenuItem aMenuItem) {
        this.items.add(aMenuItem);
        return items;
    }

    public ArrayList<MenuItem> removeMenuItem (MenuItem aMenuItem) {
        if(this.items.contains(aMenuItem)) {
            this.items.remove(aMenuItem);
        }
        return null;
    }

    public String lastUpdated() {
        return ("The menu was last updated on " + this.getLastUpdated());
    }
    public void printMenuAll (Menu aMenu) {
        // System.out.println(System.out.println(aMenuItem.name + ": " + aMenuItem.description + ", $" + aMenuItem.price));
    }



}