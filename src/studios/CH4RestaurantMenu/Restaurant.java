package studios.CH4RestaurantMenu;

import java.sql.Date;
import java.time.LocalDate;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem travs = new MenuItem("Toast Raviolis", 10, "Deep-fried ravioli served with bolognese sauce", "Appetizers", Date.valueOf(LocalDate.now()));
        MenuItem carrots = new MenuItem("carrots", 100, "just some ordinary, raw carrots", "Appetizers", Date.valueOf(LocalDate.now()));
        MenuItem chicken = new MenuItem("Zuni Chicken", 30, "fire-broiled whole 3-lb roaster seasoned with fresh herbs", "Mains", Date.valueOf((LocalDate.now())));
        MenuItem cake = new MenuItem("Chocolate Cake", 15, "The best cake you'll ever eat!", "Dessert", Date.valueOf(LocalDate.now()));



    }

}
