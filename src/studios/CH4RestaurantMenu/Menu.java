package studios.CH4RestaurantMenu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private static ArrayList menu = new ArrayList<>();
    private Date lastUpdated;

    public Menu(ArrayList appetizers, ArrayList mains, ArrayList desserts, Date lastUpdated) {
        this.menu = appetizers;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList getMenu() {
        return menu;
    }

    public void setMenuItems(ArrayList menuItems) {
        this.menu = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public static void addMenuItem (MenuItem aMenuItem) {
        menu.add(aMenuItem);
    }

    public static void removeMenuItem (MenuItem aMenuItem) {
        if (menu.contains(aMenuItem)) {
            menu.remove(aMenuItem);
        }

    }

    public static Date lastUpdated (Menu aMenu) {
        return aMenu.lastUpdated;
    }
    public static ArrayList printMenuAll (Menu aMenu) {
        return aMenu.getMenu();
    }



}