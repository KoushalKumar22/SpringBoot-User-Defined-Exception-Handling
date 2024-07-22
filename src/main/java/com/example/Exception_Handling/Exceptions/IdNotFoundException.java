package com.example.Exception_Handling.Exceptions;

public class IdNotFoundException extends RuntimeException{

    public IdNotFoundException(String message){
        super(message);
    }
}
