/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.visitor;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);

    
}
