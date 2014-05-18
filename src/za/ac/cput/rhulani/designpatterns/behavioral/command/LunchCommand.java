/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.command;

import za.ac.cput.rhulani.designpatterns.behavioral.command.Command;
import za.ac.cput.rhulani.designpatterns.behavioral.command.Lunch;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class LunchCommand implements Command
{
    Lunch lunch ;
    public LunchCommand(Lunch lunch) {
    this .lunch = lunch ;
    }
    @Override
    public void execute() {
    lunch .makeLunch() ;
    }

}
