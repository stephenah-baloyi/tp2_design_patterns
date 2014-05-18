/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class Menu {
    
    List<Item> menuItems ;
    public Menu() {
    menuItems = new ArrayList<Item>();
    }
    public void addItem(Item item) {
    menuItems .add(item);
    }
    public Iterator<Item> iterator() {
    return new MenuIterator () ;
    }
    class MenuIterator implements Iterator<Item> {
    int currentIndex = 0;
    @Override
    public boolean hasNext() {
    if (currentIndex>= menuItems .size()) {
    return false ;
    } else { return true;
    }
    }
    @Override
    public Item next() {
    return menuItems .get(currentIndex++);
    }
    @Override
    public void remove() {
    menuItems .remove(--currentIndex);
    }
    }

    
}
