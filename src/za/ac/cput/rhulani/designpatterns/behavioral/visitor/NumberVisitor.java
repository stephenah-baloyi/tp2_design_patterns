/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.visitor;

import java.util.List;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public interface NumberVisitor {
    
public void visit(TwoElement twoElement);
public void visit(ThreeElement threeElement);
public void visit(List<NumberElement> elementList);

    
}
