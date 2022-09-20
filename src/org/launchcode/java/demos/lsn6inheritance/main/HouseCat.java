package org.launchcode.java.demos.lsn6inheritance.main;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);  //  Grants access to the base class Cat constructor which has the (double aWeight) params.
        name = aName;
    }

//  Sample constructor to demonstrate the no-argument constructor in Cat class, per book example 7.3.2
    public HouseCat(String aName) {
        name = aName;
    }


    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

//    @Override
//    public String noise() {
//        return "Hello, my name is " + name + "!";
//    }

//   Re-writing above noise() to demo/print 7.3.3 book example for calling original base class version of method.
    @Override
    public String noise() {
        if (isSatisfied()) {
            return "Hello, my name is " + name + "!";
        } else {
            return super.noise();   //  prints "Meeeeeoooooowwww!"
        }
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
