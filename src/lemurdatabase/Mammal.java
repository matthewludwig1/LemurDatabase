/*
    Matt Ludwig
    04-30-2019
    This class holds the common attricbutes of various Mammals
 */
package lemurdatabase;

/**
 *
 * @author malud0519
 */
    public class Mammal {
    private int itsAge;
    private int itsWeight;
    private String breed, gender;
  

    public Mammal() {  // default
        itsAge = 2;   
        itsWeight = 5;  
    }

    public int getAge() {
        return itsAge;
    }

    public int getWeight() {
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

