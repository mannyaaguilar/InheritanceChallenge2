package com.manny;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Manny manny = new Manny();
        Star star = new Star();

        manny.directionWalking(1); //Choose between 0 and 4

        manny.travelDistance(350); //travelDistance() / travelTime = walkingSpeed()
        manny.travelTime(5);
        manny.walkingSpeed();

        //manny.totalTime(); *No need to call out this method...WHY NOT?!

        star.directionWalking(1); //Choose between 0 and 4

        star.travelDistance(450); //travelDistance() / travelTime = walkingSpeed()
        star.travelTime(7);
        star.walkingSpeed();



    }
}
