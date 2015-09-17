package pkg17sephelloworld;

import java.util.Date;

public class Person {
    public final Date dateOfBirth;
    public int getAge(){
        
        int x = 123 / MILLISECONDS_PER_YEAR;
        
        //throw new RuntimeException("no implementado");
    }
    private static final int MILLISECONDS_PER_YEAR = 1000*60*60*24*365;
            
    private final String firstName;
    private final  String familyName;
        
    public Person(String firstName, String familyName, Date dateOfBirth) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }
        
        
                
    public String getFullName(){
        return this.firstName + " " + familyName;
    }
        
        
        
}
   
