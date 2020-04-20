package Homework1;

public class Wall {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void take (Jumpable jumpable) {
        jumpable.jump(height);
    }
}
