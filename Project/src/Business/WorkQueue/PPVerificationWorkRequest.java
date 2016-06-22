/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Person.Person;

/**
 *
 * @author "Smit Shah, NUID: 001748537, AED - Final Project"
 */
public class PPVerificationWorkRequest extends WorkRequest{
 
    private Person objPerson;

    public Person getObjPerson() {
        return objPerson;
    }

    public void setObjPerson(Person objPerson) {
        this.objPerson = objPerson;
    }

//    @Override
//    public String toString() {
//        return objPerson.getPersonFirstName() + " " +objPerson.getPersonLastName();
//    }
    
}
