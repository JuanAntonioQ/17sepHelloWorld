package pkg17sephelloworld;

public class Person {
    private final String firstName;
    private final  String familyName;
        
    public Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
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
   
