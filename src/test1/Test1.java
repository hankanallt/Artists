
package test1;

import java.util.ArrayList;


public class Test1 {

    
    public static void main(String[] args) {
        
        ArrayList <Person> artists = new ArrayList<>();
        
        artists.add(new Singer("Jay", 33));
        artists.add(new Actor("Anil Kapoor", 55));
        artists.add(new Singer("Asha Bhosle", 66));
        artists.add(new Actor("Govinda", 44));
        
        for (Person artist : artists) {
            artist.perform();
            artist.age();
        }
    }
    
}
