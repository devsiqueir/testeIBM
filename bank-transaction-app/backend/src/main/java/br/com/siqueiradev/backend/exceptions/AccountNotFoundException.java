package br.com.siqueiradev.backend.exceptions;

public class AccountNotFoundException extends Throwable {
    
    public AccountNotFoundException(String message) {
        super(message);  // Call the superclass constructor with the message
    }
}