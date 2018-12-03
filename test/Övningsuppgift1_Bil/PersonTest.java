package Övningsuppgift1_Bil;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest {
    
    String name = "Anna Andersson";
    int age = 33;
    String addres = "Drottninggatan 1";
    
    Person person = new Person(name, addres, age);
    
    @Test
    public void getNameTest(){
        String actual = person.getName();
        
        TestCase.assertTrue(actual.equals(name));
        TestCase.assertFalse(actual.equals("fdsfs"));
    }

}
