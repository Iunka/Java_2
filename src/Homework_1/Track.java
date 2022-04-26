package Homework_1;

public class Track implements Obstacle {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean doIt(RunJumpable x) {
        return x.run(distance);
    }
}