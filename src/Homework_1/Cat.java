package Homework_1;

public class Cat implements RunJumpable {

    private int maxRun = 10000;
    private int maxJump = 10;

    @Override
    public boolean run(int dinstance) {
        if (maxRun >= dinstance) {
            System.out.println("Cat ran the track " + dinstance + ". Success!");
            return true;
        } else {
            System.out.println("Cat can't ran the track " + dinstance + ". Fail!");
        }
        return false;
    }

    @Override
    public boolean jump(int dinstance) {
        if (maxJump >= dinstance) {
            System.out.println("Cat jump the wall " + dinstance + ". Success!");
            return true;
        } else {
            System.out.println("Cat can't jump the wall " + dinstance + ". Fail!");
        }
        return false;
    }
}