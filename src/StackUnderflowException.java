/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

/**
 * Exception thrown when a stack underflows.
 * @author Ian Clement
 */
public class StackUnderflowException extends RuntimeException {

    public StackUnderflowException() {
        super();
    }

    public StackUnderflowException(String message) {
        super(message);
    }
}
