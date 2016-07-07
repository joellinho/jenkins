package com.mycompany.app;
import java.util.Properties;
import java.io.IOException;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest    extends TestCase
        {
   String prop;
    
    public void setUp(){
        Properties propiedad = new Properties();
        
        try {
            propiedad.load(getClass().getResourceAsStream("/test.properties"));
            prop = propiedad.getProperty("valor");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
     
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertEquals( "valor prueba",prop );
    }
}
