/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.command;

import za.ac.cput.rhulani.designpatterns.behavioral.command.Command;
import za.ac.cput.rhulani.designpatterns.behavioral.command.Dinner;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class DinnerCommand implements Command{
    
    Dinner dinner ;
    public DinnerCommand(Dinner dinner) {
    this .dinner = dinner ;
    }
    @Override
    public void execute() {
    dinner .makeDinner() ;
    }

    
}
