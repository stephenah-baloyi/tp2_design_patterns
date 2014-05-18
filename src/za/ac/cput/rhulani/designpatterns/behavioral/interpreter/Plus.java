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
public class Plus implements Expression{
    
    Expression leftOperand;
    Expression rightOperand;
    
    public Plus(Expression left, Expression right)
    {
        leftOperand = left;
        rightOperand = right;
    }

    @Override
    public int Interpret(Map<String, Expression> variables) {
        return leftOperand.Interpret(variables) + rightOperand.Interpret(variables);
    }
    
}
