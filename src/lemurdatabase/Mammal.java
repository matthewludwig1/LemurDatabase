/*
    Matt Ludwig
    05-03-2019
    This class holds the common attributes of various Mammals
 */
package lemurdatabase;

/**
 *
 * @author malud0519
 */
    public class Mammal {
    private int itsAge;
    private double itsWeight;
    private String breed, gender;
  

    public Mammal() { 
        itsAge = (int) (Math.random() * 18) + 1;   
        itsWeight = (Math.random() * 15) + 1;  
    }

    public int getAge() {
        return itsAge;
    }

    public double getWeight() {
        return itsWeight;
    }

    public void setAge(int newAge) {
        itsAge = newAge;
    }

    public void setWeight(int newWeight) {
        itsWeight = newWeight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }
    
    public void setGender(String gdr) {   // will need to be accessed by the lemur classes
        gender = gdr;                            
    }
    
    public String getGender() {
        return gender;
    }
}
