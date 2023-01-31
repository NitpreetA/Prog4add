/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

/**
 * Exception thrown when a stack overflows.
 * @author Ian Clement
 */
public class StackOverflowException extends RuntimeException {

    public StackOverflowException() {
        super();
    }

    public StackOverflowException(String message) {
        super(message);
    }
}
