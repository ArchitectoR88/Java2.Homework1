package Homework1;

public class Robot implements Runable, Jumpable {

    private int jumpLimit, runLimit;

    public Robot(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    @Override
    public void jump(int limit) {
        if (limit < jumpLimit) {
            jumpLimit -= limit;
            System.out.println("Robot прыгнул на " + limit + " метров");
            System.out.println("Сейчас высота равна = " + jumpLimit + " метров");
        } else {
            System.out.println("Robot не может прыгнуть на высоту " + jumpLimit + " метров");
        }
    }

    @Override
    public void run(int limit) {
        if (limit < runLimit) {
            runLimit -= limit;
            System.out.println("Robot пробежал " + limit + " метров");
            System.out.println("Сейчас длина равна = " + runLimit + " метров");
        } else {
            System.out.println("Robot не может пробежать дистанцию " + runLimit + " метров");
        }
    }
}