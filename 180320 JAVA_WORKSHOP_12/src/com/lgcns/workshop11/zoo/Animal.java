package com.lgcns.workshop11.zoo;

public class Animal {

    
    private String animalId;
    private String animalName;
    private int animalCount;
    
    public Animal() {
        
    }
    
    public Animal(String animalId, String animalName, int animalCount) {
        this.animalId = animalId;
        this.animalName = animalName;
        this.animalCount = animalCount;
    }
    
    
    public String toString() {
        return getAnimalId() + "\t "+ getAnimalName() + "\t " + getAnimalCount() + "마리\t";
    }


    public String getAnimalId() {
        return animalId;
    }


    public String getAnimalName() {
        return animalName;
    }


    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalId( String animalId ) {
        this.animalId = animalId;
    }

    public void setAnimalName( String animalName ) {
        this.animalName = animalName;
    }

    public void setAnimalCount( int animalCount ) {
        this.animalCount = animalCount;
    }



}
