package com.simple.simplecounter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Square" + getCounter(3,4) );
    }
    
    public static int getCounter(int length, int width) {
    	return length * width;
    }
}
