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
        String lemurs[] = new String[numLem];   
        for (int i = 0; i < numLem; i++) {
            lemurs[i] = "";
            typeLem = Integer.parseInt(JOptionPane.showInputDialog("1-Tree Lemur" + "\n"
            + "2-Desert Lemur" + "\n" + "3-Jungle Lemur"));
            
            if (typeLem == 1) {
                lemurs[i] += "Tree Lemur."; // could construct lemur here
                //construct lemurs[i] : lemurs[i] = new TreeLemur();
            }
            
            else if (typeLem == 2) {
                lemurs[i] += "Desert Lemur.";
            }
            
            else if (typeLem == 3) {
                lemurs[i] += "Jungle Lemur.";
            }
            System.out.println("Creating ");
        }
        System.out.println("Displaying the Lemurs:" + "\n" + "-------------------------------"
                + "------" + "\n \n");
        
    }
}
