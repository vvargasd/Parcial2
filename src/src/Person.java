/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Person {
    
    private String name;
    private String id;
    private ArrayList<Pet> pets;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;        
    }
    
    
    
    public String getId(){
        return id;
    }
    public void showPets(){
        
    }

    void addPet(Pet p) {
        //pets.add(p);
    }
    
}
