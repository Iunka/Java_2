package Homework_1;

public class Human implements RunJumpable{

    private int maxRun = 1000;
    private int maxJump = 3;

    @Override
    public boolean run(int dinstance) {
        if (maxRun >= dinstance) {
            System.out.println("Human ran the track " + dinstance + ". Success!");
            return true;
        } else {
            System.out.println("Human can't ran the track " + dinstance + ". Fail!");
        }
        return false;
    }

    @Override
    public boolean jump(int dinstance) {
        if (maxJump >= dinstance) {
            System.out.println("Human jump the wall " + dinstance + ". Success!");
            return true;
        } else {
            System.out.println("Human can't jump the wall " + dinstance + ". Fail!");
        }
        return false;
    }
}