package org.launchcode.java.demos.lsn6inheritance.main;

public class Main {

    public static void main(String[] args) {

//  Creating an instance of HouseCat (this in turn extends members of Cat class per HouseCat.)
        HouseCat garfield = new HouseCat("Garfield", 12);

//  First time we check isSatisfied is true b/c both hungry/tired are false.
        System.out.println(garfield.isSatisfied());

//  This triggers the check that if cat eats when !hungry, then tired becomes true.
        garfield.eat();
        System.out.println(garfield.isTired());

//  Testing to print out family, noise, purr info.
        System.out.println(garfield.getFamily() + "\n" + garfield.noise() + "\n" + garfield.purr());

//  Since tired is now true from calling eat() instance method, isSatisfied is now false.
        System.out.println(garfield.isSatisfied());

//  Prints the weight.
        System.out.println(garfield.getWeight());  // prints 12 from instance creation at top.


//  This instance won't compile b/c cannot utilize Cat constructor. Must use HouseCat constructor which requires diff. params.
//        HouseCat mittens = new HouseCat(8.4);  //  Will not compile b/c does not match constructor params from HouseCat class.



//  Sample instance to demonstrate the no-argument constructor codes in Cat class/HouseCat class, per book example 7.3.2
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());   // prints 13 b/c the Cat no-arg constructor is implicitly implied here.


//  Sample instance to demo/print use of @Override annotation: HouseCat noise() sub class overriding Cat noise() base class.
/* NOTE: I had to turn this example code OFF below b/c of making the Cat class "abstract" in line 3 of Cat, which
 prevents an instance of Cat from being created at all. */
//        Cat plainCat = new Cat(8.6);
//        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"

        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

    }

}
