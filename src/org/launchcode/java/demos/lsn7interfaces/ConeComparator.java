package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {

//  Cannot use default-generated return below b/c return type is int (-1, 0, 1) but subtracting w/ money returns double type.
//        return o1.getCost() - o2.getCost();

//  Use if/else it/else block to evaluate and return a pos int, neg int, or 0, depending on the result to match int type.
        if (o1.getCost() - o2.getCost() < 0) {
            return -1;
        } else if (o1.getCost() - o2.getCost() > 0) {
            return 1;
        } else {
            return 0;
        }

    }
}
