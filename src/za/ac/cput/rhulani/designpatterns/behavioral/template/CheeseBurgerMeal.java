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
public class CheeseBurgerMeal extends Meals{
    
            @Override
        public void prepareIngredients () {
        System .out.println("Getting ground beef and Cheese");
        }
        @Override
        public void cook() {
        System .out.println("Cooking ground beef in pan");
        }
        @Override
        public void eat() {
        System .out.println("The Cheese Burgers are tasty");
        }
        @Override
        public void cleanUp() {
        System .out.println("Doing the dishes");
        }

    
}
