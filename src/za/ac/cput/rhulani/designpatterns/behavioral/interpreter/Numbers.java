/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.interpreter;

import za.ac.cput.rhulani.designpatterns.behavioral.interpreter.Expression;
import java.util.Map;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class Numbers implements Expression{
    private int number;
    
    public Numbers(int number)
    {
        this.number = number;
    }

    @Override
    public int Interpret(Map<String, Expression> variables) {
        return number;
    }
    
}
