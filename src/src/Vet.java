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
public class Vet {
    
    ArrayList<Pet> pets = new ArrayList<Pet>();
    
    public void removePet(Pet p){
        
    }
    
    public void showPetsByType(String type){
        
    }
    
    public void showPets(){
        for(Pet p : pets){
            System.out.println(p.toString());
        }
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    
    
    
}
