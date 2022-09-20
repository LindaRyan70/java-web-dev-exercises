package org.launchcode.java.demos.lsn6inheritance.main;

public abstract class Cat {  //  Adding "abstract" prevents any creation of a Cat class instance object!

    private boolean tired = false;
    private boolean hungry = false;
    private double weight;

    // The biological family for all cat species
    private String family = "Felidae";

    public Cat (double aWeight) {
        weight = aWeight;
    }


//    Sample no-argument constructor per book example 7.3.2
    public Cat () {
        weight = 13;
    }


    /**** Getters and Setters ****/

    public boolean isTired() {
        return tired;
    }

    public void setTired(boolean aTired) {
        tired = aTired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean aHungry) {
        hungry = aHungry;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double aWeight) {
        weight = aWeight;
    }

    public String getFamily() {
        return family;
    }

    /**** Instance Methods ****/

    // A cat is rested and hungry after it sleeps
    public void sleep() {
        tired = false;
        hungry = true;
    }

    // Eating makes a cat not hungry
    public void eat() {

        // eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
    }

    public String noise () {
        return "Meeeeeeooooowww!";
    }

/* Sample code to demo creating an abstract method w/in an abstract class. Turned off b/c causes issues with demo
    code for using super to call a method in a base class. */
//
//    public abstract String noise ();   //  This requires the subclass to implement its own version of this method!

    }
