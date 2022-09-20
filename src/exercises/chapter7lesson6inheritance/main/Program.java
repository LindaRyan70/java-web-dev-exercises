package exercises.chapter7lesson6inheritance.main;

public class Program {

    public static void main(String[] args) {

        Laptop myLaptop = new Laptop(2, 3, true, 5);

        SmartPhone mySmartPhone = new SmartPhone(1, 3, false, 30);


        System.out.println(myLaptop);
        System.out.println(mySmartPhone);



//        System.out.println(myLaptop);
//        System.out.println(mySmartPhone);

    }
}
