package Övningsuppgift1_Bil;

import junit.framework.TestCase;
import org.junit.Test;

public class BilDramaTest {
    
    String expectedRegNr = "ASD 123";
    String expectedLabel = "Toyota";
    Bil bil = new Bil(expectedRegNr, expectedLabel);
    Bilägare bilägare = new Bilägare("Kalle", "Hemma", 45);
    
    @Test
    public void printCarWithoutOwnerTest(){
        String actual = BilDrama.printBil(bil);
        String expected = "Bilen med regNummer ASD 123 har ingen ägare";
        System.out.println(actual);
        
        TestCase.assertTrue(actual.equals(expected));
        TestCase.assertFalse(actual.equals("fdsfs"));
    }
    
    @Test
    public void printCarWithOwnerTest(){
        bil.ägsAv(bilägare);
        String actual = BilDrama.printBil(bil);
        String expected = "Bilen med regNummer ASD 123 är av typen Toyota och ägs av Kalle";
        
        TestCase.assertTrue(actual.equals(expected));
        TestCase.assertFalse(actual.equals("fdsfs"));
    }


}
