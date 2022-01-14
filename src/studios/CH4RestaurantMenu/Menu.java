package studios.CH4RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu(ArrayList appetizers, ArrayList mains, ArrayList desserts, Date lastUpdated) {
        this.menuItems = appetizers;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}