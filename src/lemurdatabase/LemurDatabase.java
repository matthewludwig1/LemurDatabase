/*
    Matt Ludwig
    05-01-2019
    This program allows the user to create different types of lemurs, using
 */
package lemurdatabase;

/**
 *
 * @author malud0519
 */
import javax.swing.*;
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numLem, typeLem;
        numLem = Integer.parseInt(JOptionPane.showInputDialog("How many Lemurs do you want"
                + " to add?"));
        String lemurs[] = new String[numLem]; // might need to output in order
        for (int i = 0; i < numLem; i++) {
            lemurs[i] = "";
            typeLem = Integer.parseInt(JOptionPane.showInputDialog("1-Tree Lemur" + "\n"
            + "2-Desert Lemur" + "\n" + "3-Jungle Lemur"));
            
            if (typeLem == 1) {
                lemurs[i] = new TreeLemur();  // will need to declare toString()
                                              // inside of the lemur classes
                System.out.println("Creating Tree Lemur");
            }
            
            else if (typeLem == 2) {
                lemurs[i] = new DesertLemur();
                System.out.println("Creating Desert Lemur");
            }
            
            else if (typeLem == 3) {
                lemurs[i] = new JungleLemur();
                System.out.println("Creating Jungle Lemur");
            }
            // lemurs[i].setAge(((int)(Math.random) * 18) + 1)
            
        }
        System.out.println("Displaying the Lemurs:" + "\n" + "-------------------------------"
                + "------" + "\n \n"); 
        
        for (int j = 0; j < numLem; j++) {
            System.out.println(lemurs[j].toString()); // prints lemur information
        }
    }
}
