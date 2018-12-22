package com.manny;

public class Human {

    private String name;
    private int age;

    private int speed;
    private int distanceWalked;
    private int totalTime;
    private int currentDirection;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;

        this.speed = 0;
        this.distanceWalked = 0;
        this.totalTime = 0;
        this.currentDirection = 0;

    }

    public void travelDistance(int distance){
        this.distanceWalked = distance;
        System.out.println("Person.travelDistance() : for " + distance + " miles.");
    }

    public void travelSpeed(int speed){
        this.speed = speed;
    }

    public void travelTime(int time){
        this.totalTime = time;
    }

    public void travelDirection(int direction){
        this.currentDirection = direction;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistanceWalked() {
        return distanceWalked;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.distanceWalked = 0;
    }
}
