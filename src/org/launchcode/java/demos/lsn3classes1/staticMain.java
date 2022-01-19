package org.launchcode.java.demos.lsn3classes1;

public class staticMain {
    public static void main(String[] args) {
        System.out.println(staticExample.exampleStaticVariable); // this works, because you're calling a static variable in a static way
        //System.out.println(AnExample.exampleNonStaticVariable); // this doesn't work, because you're trying to call a non-static variable in a static way
        staticExample ex = new staticExample();

        System.out.println(staticExample.exampleStaticVariable); // this works, because you're calling a static variable in a non-static way
        System.out.println(ex.exampleNonStaticVariable); // this works, because you're calling a non-static variable in a non-static way
        System.out.println("hello");

        staticExample.staticHello(); // this works, because you're calling a static method in a static way
        //AnExample.nonStaticHello(); // this doesn't work, because you're trying to call a non-static method in a static way
        ex.nonStaticHello(); // this works, because you're calling a non-static method in a non-static way

        //in summary, you can only call non-static variables/methods in non-static ways (you have to have an instance of a class)
        //but, you can call static variables/methods in static ways AND non-static ways
    }
}