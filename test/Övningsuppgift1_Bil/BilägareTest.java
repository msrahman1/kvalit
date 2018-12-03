package Övningsuppgift1_Bil;

import junit.framework.TestCase;
import org.junit.Test;


public class BilägareTest {
    String name = "Anna Andersson";
    int age = 33;
    String addres = "Drottninggatan 1";
    
    Bilägare bilägare = new Bilägare(name, addres, age);
    
    @Test
    public void getNameTest(){
        String actual = bilägare.getName();
        
        TestCase.assertTrue(actual.equals(name));
        TestCase.assertFalse(actual.equals("fdsfs"));
    }
}
