package com.manny;

public class Manny extends Person {


    public Manny() {
        super("Manny", 38, "Brown", "Brown", 220, true);

    }

    public void walkingSpeed(){
        int newWalkingSpeed = getDistanceWalked() / getTotalTime();
        if(newWalkingSpeed == 0){
            stop();
        }else if(newWalkingSpeed > 0){
            changeTravelSpeed(newWalkingSpeed);
        }
        totalTime();
    }

    public void totalTime(){
        int newTotalTime = getDistanceWalked() / getSpeed();
        if(newTotalTime == 0) {
            stop();
        }else if (newTotalTime > 0){
            changeTravelTime(newTotalTime);
        }
    }

    public void directionWalking(int direction){

        int newDirection = direction;

        switch(newDirection){
            case 0:
                System.out.println(getName() + " is Stopped");
                break;

            case 1:
                System.out.println(getName() + " is walking North");
                break;

            case 2:
                System.out.println(getName() + " is walking South");
                break;

            case 3:
                System.out.println(getName() + " is walking East");
                break;

            case 4:
                System.out.println(getName() + " is walking West");
                break;

            default:
                System.out.println("Unknown");
                break;
        }
        changeTravelDirection(newDirection);
    }

}

