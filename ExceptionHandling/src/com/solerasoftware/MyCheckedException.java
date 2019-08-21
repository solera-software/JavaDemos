package com.solerasoftware;

// This is a checked exception since java.lang.RuntimeException
// is *not* in its ancestry
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
