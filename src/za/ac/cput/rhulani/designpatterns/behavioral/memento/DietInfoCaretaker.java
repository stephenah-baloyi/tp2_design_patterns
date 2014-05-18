/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.rhulani.designpatterns.behavioral.memento;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class DietInfoCaretaker {
    
    Object objMemento ;
public void saveState(DietInfo dietInfo) {
objMemento = dietInfo .save() ;
}
public void restoreState(DietInfo dietInfo) {
dietInfo .restore(objMemento);
}

    
}
