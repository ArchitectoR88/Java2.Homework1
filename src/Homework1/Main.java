package Homework1;

//        1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
//        классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
//        консоль).
//        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий.
//        4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
//        на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
//        препятствий не идет.

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
