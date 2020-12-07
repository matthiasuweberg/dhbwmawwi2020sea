package lecture.chapter6;

import lecture.chapter5.Car;

public class Dog extends Animal {

    private String breed;

    public Dog(float size, String description, float weight, String breed){
        super(size, description, weight);
        setBreed(breed);
    }

    public void bark(){
        System.out.println("Der Hund "+ getDescription() + " bellt!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}