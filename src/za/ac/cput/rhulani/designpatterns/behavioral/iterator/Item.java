/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.iterator;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class Item {
    
        String name ;
    float price ;
    public Item(String name , float price) {
    this .name = name ;
    this .price = price ;
    }
    public String toString() {
    return name + ": $" + price;
    }

    
}
