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
public class Cat extends Pet{
    
    boolean isHunter;

    public Cat(String id, String name, String hairColor, boolean isHunter) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }

    @Override
    public String sound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cat{" + "isHunter=" + isHunter + '}';
    }
    
    
}
