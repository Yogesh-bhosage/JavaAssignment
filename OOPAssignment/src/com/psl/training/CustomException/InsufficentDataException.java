package com.psl.training.CustomException;

public class InsufficentDataException extends Exception{
    public InsufficentDataException(){
        System.out.println("Data is Not in Stock");
    }
}
