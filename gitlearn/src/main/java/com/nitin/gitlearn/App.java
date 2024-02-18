package com.nitin.gitlearn;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(sum(10,30));
        System.out.println("substraction: "+ substract(10, 5));
        System.out.println("multiply: "+ multiply(7, 8));
        System.out.println(printDoc());
    }
    
    public static int sum (int a, int b) {
    	return a+b;        
    }
    
    public static int substract(int a, int b) {
    	return (a - b);
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }


    public static int newcalculation(int a, int b) {
        return (a * b * b * b)/(a * a);
    }
    
    public static String printDoc() {
    	return "printDoc method";
    }
}
