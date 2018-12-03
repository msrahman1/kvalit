package Övningsuppgift1_Bil;

public class Person {
    
    private String namn;
    private String adress;
    private int ålder;
    
    public Person (String namn, String adress, 
            int ålder){
        this.namn = namn;
        this.adress = adress;
        this.ålder = ålder;
    }
       
    public String getName() {
        return namn;
    }
    
}