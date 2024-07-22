package com.example.Exception_Handling.Exceptions;

public class BioNotFoundException extends RuntimeException{
    public BioNotFoundException(String message){
        super(message);
    }
}
