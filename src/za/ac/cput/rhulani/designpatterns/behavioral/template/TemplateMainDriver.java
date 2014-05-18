/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.rhulani.designpatterns.behavioral.template;

/**
 *
 * @author Mhumhu
 */
public class TemplateMainDriver {
    public static void main(String[] args)
    {
        Meals meal1 = new HamburgerMeal();
        meal1.doMeal();
        
        System.out.println();
        
        Meals meal2 = new CheeseBurgerMeal();
        meal2.doMeal();
    }
}
