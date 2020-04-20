package Homework1;

public class Treadmill {

    private int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    public void take (Runable runable){
        runable.run(lenght);
    }
}
