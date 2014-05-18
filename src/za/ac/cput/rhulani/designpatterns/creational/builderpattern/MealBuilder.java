/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.creational.builderpattern;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public interface MealBuilder {
    public void buildDrink() ;
    public void buildMainCourse () ;
    public void buildSide() ;
    public Meal getMeal() ;
 }


