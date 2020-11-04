package Lesson_5;

public class Animal {
    protected String name;
    protected double jumpHeight;
    protected int runDistance;
    protected int swimDistance;


    public Animal(String name, int runDistance, int swimDistance, double jumpHeight){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    protected String getName() {
        return name;
    }
    protected double getJump() {
        return jumpHeight;
    }

    protected int getSwim(){
        return swimDistance;
    }

    protected int getRun(){
      return runDistance;
    }

}
