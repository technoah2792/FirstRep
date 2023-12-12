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
        System.out.println(printDoc());
    }
    
    public static int sum (int a, int b) {
    	return a+b;
    }
    
    public static String printDoc() {
    	return "printDoc method";
    }
}
