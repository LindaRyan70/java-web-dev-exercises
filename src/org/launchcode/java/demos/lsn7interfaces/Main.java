package org.launchcode.java.demos.lsn7interfaces;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

//      I researched/added this import to use money.format() to print any money with $ and commas and 2 decimal places.
        DecimalFormat money = new DecimalFormat("$###,###.00"); // 0 instead of # allows for default 0 value.

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field. (Turn off when prepping to print Before/After lists below.)

//        These 2 steps below can be combined into one.
//        Comparator comparator = new FlavorComparator();  // declaring and initializing the comparator object.
//        flavors.sort(comparator);                        // sorting the flavors

//        This line combines the 2 lines above into one line.
//        flavors.sort(new FlavorComparator());  // Declares & initializes the comparator object while calling sort().

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field. (Turn off when prepping to print Before/After lists below.)

//        cones.sort(new ConeComparator());  // Declares & initializes the comparator object while calling sort().

        // TODO: Print the 'flavors' list (in a clear manner) to verify the sorting Before and After.

        System.out.println("\n" + "Flavors by Name BEFORE Sort:" + "\n");
        for (Flavor flavor: flavors) {
            System.out.println(flavor.getName());
        }

//        These next 2 lines seem interchangeable, as they do the same thing.... WHY use one over the other?!
//        Collections.sort(flavors, new FlavorComparator());    //  This line alpha sorts the same as next line...
        flavors.sort(new FlavorComparator());    //  This line alpha sorts the same as above line...

        System.out.println("\n" + "Flavors by Name AFTER Sort:" + "\n");
        for (Flavor flavor: flavors) {  // Flavor type flavor to iterate thru ArrayList of <Flavor> flavors
            System.out.println(flavor.getName());   // Prints the individual flavor names
        }

        // TODO: Print the 'cones' list (in a clear manner) to verify the sorting Before and After.

        System.out.println("\n" + "Cones by Cost BEFORE Sort:" + "\n");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + money.format(cone.getCost())); // money.format() prints $ and .00
        }

        cones.sort(new ConeComparator());

        System.out.println("\n" + "Cones by Cost AFTER Sort:" + "\n");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + money.format(cone.getCost())); // money.format() prints $ and .00
        }

    }



}
