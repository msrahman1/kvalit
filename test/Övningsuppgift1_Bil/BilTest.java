package Övningsuppgift1_Bil;

import junit.framework.TestCase;
import org.junit.Test;


public class BilTest {
    
    String expectedRegNr = "ASD 123";
    String expectedLabel = "Toyota";
    Bil bil = new Bil(expectedRegNr, expectedLabel);
    Bilägare bilägare = new Bilägare("Kalle", "Hemma", 45);
    
    @Test
    public void getRegistrationNumberTest(){
        String actual = bil.getRegNummer();
        
        TestCase.assertTrue(actual.equals(expectedRegNr));
        TestCase.assertFalse(actual.equals("fdsfs"));
    }
    
    @Test
    public void getSortTest(){
        String actual = bil.getSort();
        
        TestCase.assertTrue(actual.equals(expectedLabel));
        TestCase.assertFalse(actual.equals("fdsfs"));
    }
    
    @Test
    public void bilägareNullFrånBörjanTest(){
        Bilägare actual = bil.getBilägare();
        
        TestCase.assertNull(actual);
    }
    
    @Test
    public void ägsAvTest(){
        bil.ägsAv(bilägare);
        Bilägare actual = bil.getBilägare();
        
        TestCase.assertNotNull(actual);
        TestCase.assertTrue(actual.getName().equals("Kalle"));
    }
    
     @Test
    public void såldTest(){
        bil.såld();
        Bilägare actual = bil.getBilägare();
        
        TestCase.assertNull(actual);
        
    }

}
