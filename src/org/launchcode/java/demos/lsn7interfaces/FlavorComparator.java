package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {    // flavor1 is o1 & flavor2 is o2 per textbook solution.
//        return 0;     // This is the default return of compare(), which results in NO sorting.
        return o1.getName().compareTo(o2.getName());    // Returns an integer (negative, positive, or zero) depending on whether Flavor object o1 or o2 comes first, alphabetically.
    }
}
