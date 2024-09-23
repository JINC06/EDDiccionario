/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eddiccionario;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author julio.nava
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        agendaDictionary();
        
        //agendaHashMap();
        
    }
    
    public static void agendaDictionary() {
        Dictionary phoneBook = new Hashtable();
        // put() method
        phoneBook.put("Johnny Walker", "2178");
        phoneBook.put("Andrew Arnold", "1298");
        phoneBook.put("Ivy Briggs", "1877");
        phoneBook.put("Ricky McBright", "2001");
        
        //Prueba repitiendo una llave
        //phoneBook.put("Ricky McBright", "2002");
        
        System.out.println("----------------------------------");
        
        //print out Hashtable out
        System.out.println(phoneBook);
        
        System.out.println("----------------------------------");
        
        //let's get the value using the key
        System.out.println(phoneBook.get("Ivy Briggs"));
        //there's no such key in out Hashtable
        System.out.println(phoneBook.get("Sol Frank"));
        
        System.out.println("----------------------------------");
        
        //Is there a record with the "Johnny Walker" key?
        System.out.println(((Hashtable) phoneBook).containsKey("Johnny Walker"));
        //all keys of the Hashtable
        System.out.println(((Hashtable) phoneBook).keySet());
        //values from Hashtable
        System.out.println(((Hashtable) phoneBook).values());
        
        System.out.println("----------------------------------");
        
        //the quantity of records
        System.out.println(phoneBook.size());
        //removing one record
        phoneBook.remove("Andrew Arnold");
        System.out.println(phoneBook);
    }
    
    
    public static void agendaHashMap() {
        
        Map<String, String> phoneBook = new HashMap<String,String>();
        
       phoneBook.put("Johnny Walker", "2178");
       phoneBook.put("Andrew Arnold", "1298");
       phoneBook.put("Ivy Briggs", "1877");
       phoneBook.put("Ricky McBright", "2001");
       
       //Prueba agregando un elemento repetido
       //phoneBook.put("Ricky McBright", "2002");
       
       System.out.println("----------------------------------");

       System.out.println(phoneBook);
       
       System.out.println("----------------------------------");
       
       System.out.println(phoneBook.get("Johnny Walker"));
       System.out.println(phoneBook.get("Ivy Briggs"));
       System.out.println(phoneBook.get("Unknown Friend"));
       
       System.out.println("----------------------------------");

       System.out.println(phoneBook.containsKey("Johnny Walker"));
       System.out.println(phoneBook.containsKey("Unknown Friend"));
       
       System.out.println("----------------------------------");

       System.out.println(phoneBook.keySet());
       System.out.println(phoneBook.values());
       
       System.out.println("----------------------------------");

       System.out.println(phoneBook.size());
       
       System.out.println("----------------------------------");

       phoneBook.remove("Andrew Arnold");

       System.out.println(phoneBook);
        
    }
}
