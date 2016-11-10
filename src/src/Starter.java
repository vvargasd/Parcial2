/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Starter {
    
    ArrayList<Person> persons = new ArrayList<Person>();
    Vet v = new Vet();
    public void readPets(Vet v){
        
    }
    
    public void manageVet(Vet v, String action){
        
    }
    
    public void readFile() throws FileNotFoundException{
        Scanner file = new Scanner(new File("pets.txt"));       
        file.useDelimiter(" ");
        ArrayList<Pet> pets = new ArrayList<Pet>();
        while(file.hasNext()){            
        String type;
        type = file.next();  
        Pet p = null;
            
        if("Dog".equals(type)){
            
            p = readDog(file);
            if(p != null)
                pets.add(p);
            
        }else if("Cat".equals(type)){
            p = readCat(file);
            pets.add(p);
        }else if("Hamster".equals(type)){
            p = readHamster(file);
            pets.add(p);
        }
            readPerson(file, type, p);        
        }
        
        v.setPets(pets);
    }
    
    public Pet readDog(Scanner file){
        String id;
        String name;
        String hairColor;
        String breed;        
        id = file.next();
        name = file.next();
        hairColor = file.next();
        breed = file.next();
        Dog d = new Dog(id, name, hairColor, breed);
        return d;
    }
    
   

    private Pet readCat(Scanner file) {
        String id;
        String name;
        String hairColor;
        boolean isHunter = false;
        id = file.next();
        name = file.next();
        hairColor = file.next();
        if(file.next().equals("true"))
            isHunter = true;
        
        Cat c = new Cat(id, name, hairColor, isHunter);
        return c;
    }

    private Pet readHamster(Scanner file) {
        String id;
        String name;
        String hairColor;       
        double weight;
        id = file.next();
        name = file.next();
        hairColor = file.next();
        weight = Double.parseDouble(file.next());
        Hamster h = new Hamster(id, name, hairColor, weight);
        return h;
    }

    private void readPerson(Scanner file, String type, Pet p) {
        String name = type;
        String id = file.next();
        boolean exist = false;
        if(persons != null){
        for(Person person : persons){
            if(id.equals(person.getId())){
                exist = true;
                break;
            }
        }
        if(!exist){
            Person pr = new Person(name, id);
            pr.addPet(p);
            persons.add(pr);
        }
        }
    }
    
     public static void main(String[] args) {
        
        Starter st = new Starter();
        try {
            
            st.readFile();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        
        st.v.showPets();
    }
        
    }
    

