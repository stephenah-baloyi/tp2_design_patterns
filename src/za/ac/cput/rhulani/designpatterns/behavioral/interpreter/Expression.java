/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.interpreter;

import java.util.Map;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public interface Expression {
    public int Interpret(Map<String,Expression> variables);
    
}
