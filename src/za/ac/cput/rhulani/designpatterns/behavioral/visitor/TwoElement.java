/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.visitor;

import za.ac.cput.rhulani.designpatterns.behavioral.visitor.NumberElement;
import za.ac.cput.rhulani.designpatterns.behavioral.visitor.NumberVisitor;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class TwoElement implements NumberElement
  {
    int a;
    int b;
    public TwoElement(int a, int b) {
    this .a = a;
    this .b = b;
    }
    @Override
    public void accept(NumberVisitor visitor) {
    visitor .visit(this);
    }
    
}
