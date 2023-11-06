package labsheet11.exercise3;

import java.util.Arrays;

public class Animal {
    private String type;
    private String[] continents;
    private double weight;
    private int age;

    public Animal() {
        this("No type specified",null,0.0,0);
    }
    public Animal(String type, String[] continents, double weight, int age) {
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public String getType() {
        return type;
    }
    public String[] getContinents() {
        return Arrays.copyOf(continents,continents.length);
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }

    public void setType (String type) {
        this.type = type;
    }
    public void setContinents (String[] continents) {
        if(continents != null)
            this.continents = Arrays.copyOf(continents,continents.length);
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        String str = "Animal Type: " + getType() + "\nAnimal Weight: " + getWeight() +
                "\nAnimal Age: " + getAge() + "\nAnimal Continents: ";

        if(continents==null) {
            str += "No continents specified";
            return str;
        }

        for(int i = 0;i < getContinents().length; i++)
            str += continents[i] + " ";

        return str;
    }
}