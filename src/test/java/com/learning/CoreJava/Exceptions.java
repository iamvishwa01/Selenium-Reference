package com.learning.CoreJava;

public class Exceptions {

    /*
    exception handling

    try can be used only once but catch can be used multiple times to catch the different types of alert


    finally block: even if program failes it executes the finally block


     */

    public static void main(String args[]){
//
//        int a =10;
//        int b = 20;
        try {
            int arr[] = new int[5];
            System.out.println(arr[7]);
        }
        catch (ArithmeticException e){
            System.out.println("Arthmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException arr ){
            System.out.println("outofbound exception");
        }
        catch (java.lang.Exception e){
            System.out.println("Arthmetic 2 exception");
        }
        finally {
            System.out.println("finally statement");
        }

    }
}
