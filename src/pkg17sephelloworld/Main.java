package pkg17sephelloworld;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    //public static final int MAX_FICHEROS_ABIERTOS = 99;
    
    public static void main(String[] args) {
        Date birth = new GregorianCalendar(1995, 1, 15).getTime();
        Person yomismo;
        yomismo = new Person("Perico", "de los Palotes",birth);
        System.out.println("me llamo"+ yomismo.getFullName());
        System.out.println("y nací el:" + birth.toString());
    }
    
    
    
}
