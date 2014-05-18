/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.structural.compositepattern;

import za.ac.cput.rhulani.designpatterns.structural.compositepattern.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class Composite implements Component{
    
    List<Component> components = new ArrayList<Component>();
        @Override
        public void sayHello() {
        for (Component component : components) {
        component .sayHello() ;
        }
        }
        @Override
        public void sayGoodbye() {
        for (Component component : components) {
        component .sayGoodbye() ;
        }
        }
        public void add(Component component) {
        components .add(component);
        }
        public void remove(Component component) {
        components .remove(component);
        }
        public List<Component> getComponents () {
        return components ;
        }
        public Component getComponent(int index) {
        return components .get(index);

        }
}
