package com.mycompany.recursivefunctionsexample;
public class RecursiveFunctionsExample {
    public static void main(String[] args) {
       System.out.println(fact(5));
       System.out.println(fact2(5));
    }
        
    //iterative function for calculating a factorial, 
    //calculates the factorial step by step
    public static int fact(int n) 
    {
     int i; //set var i
        
     for (i = n - 1; i > 0; i--) { //while i > 0, multiply n by every number less than it
     n = n * i;
     }
    return n; //return n, calculated facorial
    }
    
    //recursive function for calculating a factorial, 
    //calculates the factorial by calling itself over and over again
    public static int fact2(int n) 
    {
       //1! always = 1, so this is the base case, or stopping point)
       if(n == 1) {
          return 1;
       //factorials can be defined as (n! = n * (n-1)!). 
       //Because of this the function can call itself every loop to reduce 
       //itself all way way down to the base case
       } else {
           return n * fact2(n-1);
       }
    }
    //every time the program goes to return n * fact2(n-1), the previous return
    //statement is placed on hold while the function recurses all the way 
    //down until you hit the base case, which returns a numerical value, and 
    //the whole stack can be calculated
}
