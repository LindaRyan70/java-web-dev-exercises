package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;


public class CarTest {

//  Ex. Chptr. 6.2.4 - Initialize var here at the top & follow w/ @Before method to set up fresh class object instance data once for each test to use.
    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }


    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }


    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
//        This Car test_car initialization line below can be removed if you initialize data once at the top of the ClassTest.
//        Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }


    /* Quiz/Check Understanding Question 1: Write another version of testInitialGasTank() using assertFalse(),
    comparing the value to 0. */

//    @ Test
//    public void testInitialGasTank() {
//        assertFalse(test_car.getGasTankLevel() == 0);
//    }


    /* Quiz/Check Understanding Question 2: Write another version of testInitialGasTank() using assertTrue(). */

//    @ Test
//    public void testInitialGasTank() {
//        assertTrue(test_car.getGasTankLevel() == 10);
//    }


    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(501);
        assertEquals(test_car.getGasTankLevel(), 0, .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank, so an error should have been thrown above.");
    }

}
