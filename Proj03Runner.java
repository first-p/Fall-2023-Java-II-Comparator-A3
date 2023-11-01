

import java.util.*;

public class Proj03Runner implements Comparable<Proj03Runner>, Comparator<Proj03Runner>{

    int data = 0;
    String name = "-";

    Proj03Runner(){//overloaded constructor
        //The purpose of this constructor is to display
        // the certification.
        System.out.println(
                "I certify that this program is my own work \n"+
                        "and is not the work of others. I agree not \n" +
                        "to share my solution with others.\n" +
                        "Fred Butoma\n");
    }//end overloaded constructor

    //Overload contructor that takes integer parameter
    Proj03Runner(int num){
        //The purpose of this constructor is to store
        // the incoming data value
        data = num;
    }//end overloaded constructor

    //Overloaded constructor that takes in only String values
    Proj03Runner(String name){
        this.name = name;
    } //end overloaded constructor


    //Getter method for the int value
    public int getData() {
        return data;
    } //end getter method

    //Getter method for the String Value
    public String getName(){
        return name;
    }//end getter method

    //Override the equals method for provide consistent behavior when
    //there are duplicate elements
    public boolean equals(Object obj){
        boolean equals = false;
        if (this == obj){
            equals = true;
        }
        if (!equals && obj != null && getClass() == obj.getClass()){
            Proj03Runner other = (Proj03Runner) obj;
            equals = (data == other.data);
        }
        return equals;
    } // end method


    //Override the HashCode method as it is recommended when overriding
    //the equals method to ensure that duplicate elements have identical
    //hashcode which is important when using hash-based collections like
    //hashSet
    @Override
    public int hashCode() {
        return Objects.hash(data);
    }//end method

    //Implement the compareTO method from the Comparable interface which
    //is required when using sorted collections such as TreeSet
    @Override
    public int compareTo(Proj03Runner other){
        return Integer.compare(this.data, other.getData());
    }//end method

    //Override the toString method in order to display a meaningful string representation
    @Override
    public String toString() {
        return Integer.toString(data);
    }//end method

    //Implement compare from the Comparator Interface to compare strings and store them in descending order
    public int compare(Proj03Runner o1, Proj03Runner o2){
        return -o1.compareTo(o2);
    } //end compare method

}//end class Proj02Runner

