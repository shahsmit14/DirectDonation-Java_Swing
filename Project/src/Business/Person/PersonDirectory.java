/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class PersonDirectory {
    
    //Variable Declaration
    private ArrayList<Person> personList;
    //End of variable Declaration
    
    
    //Constructor
    public PersonDirectory() {
        
        personList = new ArrayList<Person>();
    }

    
    //Getter-setter methods
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    
    //Method to add a new Person
    public Person addPerson(String organizationName) {
        
        Person objPerson = new Person(organizationName);
        personList.add(objPerson);        
        return objPerson;
    }
    
}
