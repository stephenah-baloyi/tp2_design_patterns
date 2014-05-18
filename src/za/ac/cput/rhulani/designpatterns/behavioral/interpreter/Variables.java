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
public class Variables implements Expression{
    
    private String name;
    
    public Variables(String name)
    {
        this.name = name;
    }

    @Override
    public int Interpret(Map<String, Expression> variables) {
        if(variables.get(name) == null)
            return 0;
        else 
            return variables.get(name).Interpret(variables);
    }
    
}
