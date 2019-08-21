package com.solerasoftware;

public class ExceptionsApp {
    public static void main(String[] args) {
        // The compiler again forced us to do something about the
        // checked exception in this case we chose to handle it
        // with a try/catch
        try {
            doSomething();
        } catch (MyCheckedException e) {
            System.err.println(e.getMessage());
        } // finally can go here as appropriate

        // The unchecked exception is not handled here
        doSomethingElse();

        // Since the unchecked exception of previous method
        // call is not handled, we will never get here.
        doAnotherThing();
    }

    // The compiler forces us to deal with MyCheckedException since
    // it is a checked exception. In this case, it we're adding
    // 'throws' to the method signature.
    private static void doSomething() throws MyCheckedException {
        throw new MyCheckedException("Something went wrong");
    }

    private static void doSomethingElse() {
        throw new MyUncheckedException("Something else went wrong");
    }

    private static void doAnotherThing() {
        System.out.println("Doing another thing");
    }
}
