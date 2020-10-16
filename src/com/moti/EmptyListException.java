package com.moti;

/**
 * Exception that thrown when the user does
 * invalid operation on empty list
 */
public class EmptyListException extends Exception {
    public EmptyListException() {
        super("The list is empty");
    }
}
