package com.semsun;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static Logger log = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        log.debug("Test debug log...");
    }
}
