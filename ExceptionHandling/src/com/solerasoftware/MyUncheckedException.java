package com.solerasoftware;

// This is an unchecked exception since java.lang.RuntimeException
// is in its ancestry
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
