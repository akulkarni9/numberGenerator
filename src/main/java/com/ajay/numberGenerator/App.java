package com.ajay.numberGenerator;

import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println("unique string is " +app.toString());
        System.out.println(app.toString());
    }
    public String generateUniqueKey() {
    	String string = UUID.randomUUID().toString(); 
    	String string1 = generateUniqueKey().substring(0, 7);
    	return string;
    }
}
