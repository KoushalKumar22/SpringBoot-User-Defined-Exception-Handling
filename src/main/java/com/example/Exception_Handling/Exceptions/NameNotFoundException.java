package com.example.Exception_Handling.Exceptions;

public class NameNotFoundException extends RuntimeException{

    public NameNotFoundException(String message){
        super(message);
    }
}
