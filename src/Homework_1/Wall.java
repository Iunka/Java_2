package Homework_1;

public class Wall implements Obstacle {
    private int distance;

    public Wall(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean doIt(RunJumpable x) {
        return x.jump(distance);
    }
}