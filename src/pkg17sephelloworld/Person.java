package pkg17sephelloworld;

import java.util.Date;

public class Person {
    public final Date dateOfBirth;
    public int getAge(){
        throw new RuntimeException("no implementado");
    }
            
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
   
