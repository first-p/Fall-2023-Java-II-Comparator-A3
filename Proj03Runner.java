

import java.util.Comparator;
import java.util.Objects;

//Declare a public class that implements the Comparator interface for which a compare()
// implementation will compare strings
public class Proj03Runner implements Comparator<String>{
    String name = "";

    public Proj03Runner(){//overloaded constructor
        //The purpose of this constructor is to display
        // the certification.
        System.out.println(
                "I certify that this program is my own work \n"+
                        "and is not the work of others. I agree not \n" +
                        "to share my solution with others.\n" +
                        "Fred Butoma\n");
    }//end overloaded constructor

    //Overloaded constructor that takes only String values
    public Proj03Runner(String name){
        this.name = name;
    } //end overloaded constructor

    //Getter method for the String Value

//
    //Override the equals method to provide consistent behavior when
    //there are duplicate strings


    //Override the HashCode method as it is recommended when overriding
    //the equals method to ensure that duplicate elements have identical
    //hashcode which is important when using hash-based collections like
    //hashSet


    //Override the toString method in order to display a meaningful string representation


    //Implement compare from the Comparator Interface to compare strings and store them in descending order


}//end class Proj02Runner

