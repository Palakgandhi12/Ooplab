package bpack;

import apack.A;

public class B extends A {

    public B(int a, int b, int c) {
        super(a, b, c);
    }

    public void display() {
        System.out.println("From Class B (Subclass)");

       
        System.out.println("Public Variable: " + pubVar);
        System.out.println("Protected Variable: " + protVar);
    }
}