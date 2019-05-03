/*
    Matt Ludwig
    05-03-2019
    This class holds the characteristics of Lemurs
 */
package lemurdatabase;

/**
 *
 * @author malud0519
 */
public class Lemur extends Mammal{
    /* needs variables for the weight, gender etc, into an array, which
       will be passed into the subclasses. This class contains the common 
       attributes of Lemurs. 
    */
    private String location, coat, classification;
    
    public String getLocation() {  // alternate, in case the toString does not work
        location = "Madagascar";
        return location;
    }
    public String getCoat() {
        coat = "Fur";
        return coat;
    }
     
}
