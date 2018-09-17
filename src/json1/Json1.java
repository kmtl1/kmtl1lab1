/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json1;

import aleatoire.Person;

/**
 *
 * @author kb691423
 */
public class Json1 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person nouveau = new Person(args[0],args[1], Integer.parseInt(args[2]));
        
        System.out.println("Bonjour " + nouveau.getFirstName() + " " 
                        + nouveau.getLastName() + " tu as " + nouveau.getAge() + " ans");
    }
    
}
