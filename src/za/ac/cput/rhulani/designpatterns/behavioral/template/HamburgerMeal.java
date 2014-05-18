/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.template;

import za.ac.cput.rhulani.designpatterns.behavioral.template.Meals;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class HamburgerMeal extends Meals {
    
            @Override
        public void prepareIngredients () {
        System .out.println("Getting burgers , buns, and french fries");
        }
        @Override
        public void cook() {
        System .out.println("Cooking burgers on grill and fries in oven");
        }
        @Override
        public void cleanUp() {
        System .out.println("Throwing away paper plates");
        }

    
}
