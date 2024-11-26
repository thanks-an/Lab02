/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aimsproject.aims;

import aimsproject.aims.media.DigitalVideoDisc;
import aimsproject.aims.cart.Cart;

/**
 *
 * @author ASUS
 */
public class Aims {

    public static void main(String[] args) {
            //Create a new cart
            Cart anOrder = new Cart();
            //Create new dvd objects and add them to the cart 
            DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
            anOrder.addMedia(dvd1);
            //System.out.println(dvd1.cost);
            //System.out.println(anOrder.totalCost());

            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
            anOrder.addMedia(dvd2);
            //System.out.println(dvd2.cost);
            //System.out.println(anOrder.totalCost());

            DigitalVideoDisc dvd3= new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
            anOrder.addMedia(dvd3);
            //System.out.println(dvd3.cost);
            //System.out.println(anOrder.totalCost());

            anOrder.removeMedia(dvd3);
            //print total cost of the items in the cart System.out.println("Total Cost is: ");a
            System.out.println(anOrder.totalCost());

    }
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
}
