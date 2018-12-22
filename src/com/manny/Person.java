package com.manny;

public class Person extends Human{

    private String hairColor;
    private String eyeColor;
    private int weight;
    private boolean isWalking;

    public Person(String name, int age, String hairColor, String eyeColor, int weight, boolean isWalking) {
        super(name, age);
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.isWalking = isWalking;

        }

    public void changeTravelDirection(int direction){
        travelDirection(direction);
    }

    public void changeTravelSpeed(int miles){
        System.out.println("Person.changeTravelSpeed(): At a rate of " + miles + " mph.");
        travelSpeed(miles);
    }

    public void changeTravelTime(int hours){
        System.out.println("Person.travelTime() : It will take " + getName() + " " + hours + " hours to reach the destination");
        travelTime(hours);

    }
}
