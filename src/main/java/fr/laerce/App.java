package fr.laerce;

import fr.laerce.model.DataModel;
import fr.laerce.model.Personne;
import fr.laerce.model.Role;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        DataModel data = new DataModel();
        List<Role> r = data.getRoles();
        for (int i = 0; i < r.size(); i++) {

            System.out.println( r.get(i).toString());
        }

    }
}



