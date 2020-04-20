package Homework1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Wall [] walls = new Wall[2];
	    Treadmill [] treadmills = new Treadmill[2];
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            walls [i] = new Wall(random.nextInt(1 + 5));
            treadmills [i] = new Treadmill(random.nextInt(1 + 100));
        }
        for (int i = 0; i < 5; i++) {
            Cat cat = new Cat(random.nextInt(1 + 5), random.nextInt(1 + 100));
            Human human = new Human(random.nextInt(1 + 5), random.nextInt(1 + 100));
            Robot robot = new Robot(random.nextInt(1 + 5), random.nextInt(1 + 100));

            for (int j = 0; j < 2; j++) {
                walls[j].take(cat);
                treadmills[j].take(cat);
                walls[j].take(human);
                treadmills[j].take(human);
                walls[j].take(robot);
                treadmills[j].take(robot);
            }
        }
    }
}
