/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Estudiante
 */
public class Dog extends Pet{
    
    private String breed;

    public Dog(String id, String name, String hairColor, String breed) {
        super(id, name, hairColor);
        this.breed = breed;
    }

    @Override
    public String sound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + '}';
    }

    
    
    
    
}
