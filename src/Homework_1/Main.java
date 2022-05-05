package Homework_1;

public class Main {

    public static void main(String[] args){

        System.out.println("Start!");

        RunJumpable[] runJumpables = {
                new Human(),
                new Robot(),
                new Cat()
        };

        Obstacle[] obstacles = {
                new Track(1000),
                new Wall(4)
        };

        for (RunJumpable r: runJumpables) {
            for (Obstacle o: obstacles){
                if (!o.doIt(r)){
                    break;
                }
            }
        }

        System.out.println("Finish!");

    }
}